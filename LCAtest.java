  import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
	import static org.junit.Assert.assertEquals;

	class LCAtest {


		// Test for when LCA is node1 
		@Test
		void testIsFirstNode() {
		LCA tree = new LCA();
	 tree.root = new Node(1);
	 tree.root.left = new Node(2);
	 tree.root.right = new Node(3);
	 tree.root.left.left = new Node(4);
	 tree.root.left.right = new Node(5);
	 tree.root.right.left = new Node(6);
	 tree.root.right.right = new Node(7);
     tree.root.right.right.left = new Node(8);
		assertEquals(tree.findLCA(3,6), 3);
		}

		// Test for when LCA is node
		@Test
		void testIsSecondNode() {
		LCA tree = new LCA();
	 tree.root = new Node(1);
	 tree.root.left = new Node(2);
	 tree.root.right = new Node(3);
	 tree.root.left.left = new Node(4);
	 tree.root.left.right = new Node(5);
	 tree.root.right.left = new Node(6);
	 tree.root.right.right = new Node(7);
	 tree.root.right.right.left = new Node(8);
		assertEquals(tree.findLCA(4,2), 2);
		}

    // Test for when LCA is root
		@Test
		void testIsRoot() {
		LCA tree = new LCA();
	 tree.root = new Node(1);
	 tree.root.left = new Node(2);
	 tree.root.right = new Node(3);
	 tree.root.left.left = new Node(4);
	 tree.root.left.right = new Node(5);
	 tree.root.right.left = new Node(6);
	 tree.root.right.right = new Node(7);
	 tree.root.right.right.left = new Node(8);

		assertEquals(tree.findLCA(4,6), 1);
		}

    // Test for when LCA is not root
     @Test
     void testNotRoot() {
     LCA tree = new LCA();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    tree.root.right.right.left = new Node(8);

     assertEquals(tree.findLCA(6,7), 3);
     }
	
	// Test for when LCA is Test Node is not in BST
			@Test
			void test() {
			LCA tree = new LCA();
		 tree.root = new Node(1);
		 tree.root.left = new Node(2);
		 tree.root.right = new Node(3);
		 tree.root.left.left = new Node(4);
		 tree.root.left.right = new Node(5);
		 tree.root.right.left = new Node(6);
		 tree.root.right.right = new Node(7);
	     tree.root.right.right.left = new Node(8);
		assertEquals(tree.findLCA(3,9), 1);
			}
	}



  
