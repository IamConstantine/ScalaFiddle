package fiddle.tree

abstract class BSTNode[T]

case object EmptyNode extends BSTNode

case class Node[T](value: T, left: BSTNode[T], right: BSTNode[T]) extends BSTNode

abstract class BST[T] {
  def insert(node: Node[T], value: T) = ???
    }

