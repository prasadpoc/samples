package com.techstack.creational.builder;

/**
 * The Class LunchOrder.
 */
public class LunchOrder {

	/** The bread. */
	private final String bread;

	/** The dressing. */
	private final String dressing;

	/** The meat. */
	private final String meat;

	/**
	 * The Class Builder.
	 * 
	 * @author prasadT
	 * 
	 */
	public static class Builder {

		/** The bread. */
		private String bread;

		/** The dressing. */
		private String dressing;

		/** The meat. */
		private String meat;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}

		/**
		 * Builds the.
		 *
		 * @return the lunch order
		 */
		public LunchOrder build() {
			return new LunchOrder(this);
		}

		/**
		 * Bread.
		 *
		 * @param bread
		 *            the bread
		 * @return the builder
		 */
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		/**
		 * Dressing.
		 *
		 * @param dressing
		 *            the dressing
		 * @return the builder
		 */
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		/**
		 * Meat.
		 *
		 * @param meat
		 *            the meat
		 * @return the builder
		 */
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}

	/**
	 * Instantiates a new lunch order.
	 *
	 * @param builder
	 *            the builder
	 */
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	/**
	 * Gets the bread.
	 *
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}

	/**
	 * Gets the dressing.
	 *
	 * @return the dressing
	 */
	public String getDressing() {
		return dressing;
	}

	/**
	 * Gets the meat.
	 *
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}

}
