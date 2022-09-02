package binaryTree;

public class bstAlter {

//  Alternative solution by TA

//public void remove(int item)
//{
//	this.remove(item,root,null,false);
//}
//private void remove(int item,Node node,Node parent,boolean isleftorright)
//{
//       if(node==null)
//    	   return ;
//	if(item>node.data)
//		remove(item,node.right,node,false);
//	else if(item<node.data)
//	 remove(item,node.left,node,true);
//	else
//	{
//		 if(node.left==null && node.right==null)
//		 {
//			 if(parent==null)
//				 root=null;
//			 else {
//			 if(isleftorright)
//				 parent.left=null;
//			 else
//				 parent.right=null;
//			 }
//		 }
//		 else if(node.left==null && node.right!=null)
//		 {
//			 if(isleftorright)
//				 parent.left=node.right;
//			 else
//				 parent.right=node.right;
//		 }
//		 else if(node.left!=null && node.right==null)
//		 {
//			 if(isleftorright)
//				 parent.left=node.left;
//			 else
//				 parent.right=node.left;
//		 }	
//		 else {
//			 int max=max(node.left);
//			 node.data=max;
//			 remove(max,node.left,node,true);	 
//		 }
//			 
//	}
//}
}