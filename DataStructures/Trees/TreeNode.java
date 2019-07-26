
/**
 * һ�����ڵ��࣬�ؼ���Ϊһ���ַ������ĳ��ָ��ʡ�
 *
 */
public class TreeNode implements Comparable<TreeNode>{
  private char key;
  private double probablity;
  private TreeNode leftnode;
  private TreeNode rightnode;
  
  public TreeNode(char c, double p) {
    this.key = c;
    this.probablity = p;
    this.leftnode = null;
    this.rightnode = null;
  }

  public TreeNode() {}

  /**
   * �������ڵ�(����˵������)����ͬһ���ڵ��ϡ�
   * @param n1 һ�����ڵ�(Ҳ���ܴ���һ������)
   * @param n2 һ�����ڵ�(Ҳ���ܴ���һ������)
   * @return  �������ĸ��׽ڵ�
   */
  public TreeNode combineToNode(TreeNode n1, TreeNode n2) {
    this.key = 0; //��Ϊ����һ���ڵ�϶������ʾһ���ַ������key����Ϊ���ַ�
    this.probablity = n1.probablity + n2.probablity;
    this.leftnode = n1;
    this.rightnode = n2;
    
    return this;
  }
  
  //�ж�����ڵ��ǲ��Ǵ���һ���ַ�
  public boolean isChar() {
    return this.key != 0;
  }
  
  public char getChar() {
    return this.key;
  }
  
  public TreeNode getLeftChild() {
    return this.leftnode;
  }
  
  public TreeNode getRightChild() {
    return this.rightnode;
  }
  
  @Override
  public int compareTo(TreeNode o) {
    int result;
    if (this.probablity > o.probablity) {
      result = 1;
    }else {
      result = 0;
    }
    return result;
  }
}
