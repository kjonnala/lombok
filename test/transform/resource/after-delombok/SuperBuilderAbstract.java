public class SuperBuilderAbstract {
	public static class Parent {
		int parentField;
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<C extends Parent, B extends ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			private int parentField;
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B parentField(final int parentField) {
				this.parentField = parentField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstract.Parent.ParentBuilder(parentField=" + this.parentField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl extends ParentBuilder<Parent, ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public Parent build() {
				return new Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final ParentBuilder<?, ?> b) {
			this.parentField = b.parentField;
		}
		@java.lang.SuppressWarnings("all")
		public static ParentBuilder<?, ?> builder() {
			return new ParentBuilderImpl();
		}
	}
	public static abstract class Child extends Parent {
		double childField;
		@java.lang.SuppressWarnings("all")
		public static abstract class ChildBuilder<C extends Child, B extends ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private double childField;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B childField(final double childField) {
				this.childField = childField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstract.Child.ChildBuilder(super=" + super.toString() + ", childField=" + this.childField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Child(final ChildBuilder<?, ?> b) {
			super(b);
			this.childField = b.childField;
		}
	}
	public static class GrandChild extends Child {
		String grandChildField;
		@java.lang.SuppressWarnings("all")
		public static abstract class GrandChildBuilder<C extends GrandChild, B extends GrandChildBuilder<C, B>> extends Child.ChildBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private String grandChildField;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B grandChildField(final String grandChildField) {
				this.grandChildField = grandChildField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstract.GrandChild.GrandChildBuilder(super=" + super.toString() + ", grandChildField=" + this.grandChildField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class GrandChildBuilderImpl extends GrandChildBuilder<GrandChild, GrandChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private GrandChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected GrandChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public GrandChild build() {
				return new GrandChild(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected GrandChild(final GrandChildBuilder<?, ?> b) {
			super(b);
			this.grandChildField = b.grandChildField;
		}
		@java.lang.SuppressWarnings("all")
		public static GrandChildBuilder<?, ?> builder() {
			return new GrandChildBuilderImpl();
		}
	}
	public static void test() {
		GrandChild x = GrandChild.builder().grandChildField("").parentField(5).childField(2.5).build();
	}
}
