package com.corejava.practice.javapractices.basicsofjava.java8.functionalinterfaces;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
/**
 * 
 * @author abhishek-sriv
 *
 */
class PracticeOnFunctionalInterfaces {  
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 */
	class Tax {
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 */
	class User implements Comparator<User>, Runnable, 
	Callable<User>, Comparable<User>, Predicate<User>, 
	Consumer<User>, Supplier<User>, Function<User, Tax>{  
		public int id;
		public User user;
		public boolean isActive() {
			return false;
		}
		public User getUser(int id) {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public BigDecimal calculateTax(User user) {
			BigDecimal tax = new BigDecimal(100000);
			return tax;
		}
		public List<User> getAllUsers(){
			return null;
		}
		public boolean removeIf(Predicate<User> test) {
			return false;
		}

		@Override
		public User call() throws Exception {
			return null;
		}
		@Override
		public void run() {
		}
		@Override
		public int compare(User o1, User o2) {
			return 0;
		}
		@Override
		public int compareTo(User o) {
			return 0;
		}
		@Override
		public void accept(User t) {
		}
		@Override
		public boolean test(User t) {
			return false;
		}
		@Override
		public User get() {
			return null;
		}
		@Override
		public Tax apply(User t) {
			return null;
		}
	}  
	/**
	 * 
	 */
	public void passingDataAsArgument() {
		User userObj = new User();
		User user = userObj.getUser(56);
		BigDecimal tax = userObj.calculateTax(user);
		System.out.println(tax);
	}
	/**
	 * 
	 */
	public void passingFunctionalityAsArgument() {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		/* Functionality to execute */
		Runnable calculateTax = new Runnable() {
			/* Functionality written in run method */
			@Override
			public void run() {
			}
		};
		/* Passing functionality as argument */
		threadPool.submit(calculateTax);
	}
	/**
	 * 
	 */
	public void useOfComparator() {
		/* Anonymous inner class */
		Comparator<User> camparator = new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.compareTo(u2);
			}
		};
		System.out.println(camparator.toString());
		/* Shorthand for above code also know as Lambda */
		Comparator<User> comparator = (u1, u2)-> u1.compareTo(u2);
		System.out.println(comparator);
	}
	/**
	 * 
	 */
	public void useOfPredicate() {
		List<User> users = new User().getAllUsers();
		users.removeIf(new Predicate<User>(){
			@Override
			public boolean test(User user) {
				return !user.isActive();
			}
		});
		users.removeIf( 
				(user)->{return !user.isActive();
				} );
		users.removeIf( (user) -> !user.isActive() );
	}
	/**
	 * 
	 */
	public void useOfConsumer() {
		List<User> users = new User().getAllUsers();
		users.stream().forEach(user->{
			new User().calculateTax(user);
		});
	}
	/**
	 * 
	 */
	public void useOfFunction() {
		List<User> users = new User().getAllUsers();
		users.stream().map(user->{
			return new User().calculateTax(user);
		});
	}
	/**
	 * 
	 */
	public void useOfSupplier() {
		IntStream.generate(()->{
			return new User().getId();
		});
	}
}  