/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Point3D extends Point2D {
    //attribute - instance variable
    private int z = 0;
    
    //constructor - default constructor with no arguments
    public Point3D(){
//        super();
        this(0, 0, 0);
    }
    
    //constructor - constructor with arguments
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    
    //getter - ONLY FOR Point3D CLASS, other getter has been inherited from Point2D
    public int getZ(){
        return this.z;
    }
    
    //setter - ONLY FOR Point3D CLASS, other getter has been inherited from Point2D
    public void setZ(int z){
        this.z = z;
    }
    
    @Override
    public String toString(){
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
    }
    
}
/* Question: Vi sao Point3D da thua ke Point2D roi nhung khi dung 
   super.x va super.y thi deu bi loi private access ?, co phai do
   private da gioi han quyen chinh sua attribute cua Point2D chi trong
   khu vuc cua Point2D khong?
*/