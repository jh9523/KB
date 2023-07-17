
public class TreeExam {
	
	static class Node<K, V>{	// K, V 객체 선언할때 타입 선언
		private K key;
		private V value;
		private Node<K, V> left;
		private Node<K, V> right;
		
		public Node(K key, V value, Node<K, V> left, Node<K, V> right) {
			super();
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public Node(K key, V value) {
			this(key, value, null, null);
		}

		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
		@Override
			public String toString() {
				return "K: "+key+", V:"+value+", LEFT:"+left+",RIGHT:"+right;
			}
	}
	
	
	public static void main(String[] args) {			// static에서 non static에 접근하려면 귀찮
		Node<String, Integer> node = new Node<String, Integer>("홍", 90, null, null);
		Node<String, Integer> node2 = new Node<String, Integer>("홍", 90);
		System.out.println(node.toString());
	}
}
