package OOP_Extends;

public class Shape { //ko khai bao muc do truy cap cho class -> mac dinh private
		private String color;
		private boolean filled;
		public Shape() {
			this.color = "red";
			this.filled = true;	
		}
		public Shape(String color, boolean filled) {
			this.color = color;
			this.filled = filled;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		@Override
		public String toString() {
			return String.format("Shape[color=%s,filled=%s",color,filled?"true":"false");
		}
	}

