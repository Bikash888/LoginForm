package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DashBoard {
	
    public void dashDisplay() {
    	Stage dashboard=new Stage();
    	
    	
    	BorderPane bp=new BorderPane();
    	HBox hb=new HBox();
    	Text text=new Text("Hello!Good evening");
    	
    	
    	
    	hb.getChildren().add(text);
    	hb.setAlignment(Pos.CENTER);
    	bp.setCenter(hb);
    	
    	
    	
    	Scene seen=new Scene(bp,1000,500);
    	dashboard.setScene(seen);
    	dashboard.show();
    	
    	
    	
    	MenuBar menubar=new MenuBar();
    	Menu menufile=new Menu("file");
    	Menu menuedit=new Menu("Edit");
    	Menu menusource=new Menu("Source");
    	menubar.getMenus().addAll(menufile,menuedit,menusource);
    	
    	
    	
    	MenuItem filemenuitem1=new MenuItem("Add");
    	MenuItem filemenuitem2=new MenuItem("New");
    	MenuItem filemenuitem3=new MenuItem("save");
        menufile.getItems().addAll(filemenuitem1,filemenuitem2,filemenuitem3);
       
        
        MenuItem edititem1=new MenuItem("cut");
        MenuItem edititem2=new MenuItem("Copy");
        MenuItem edititem3=new MenuItem("Undo");
        menuedit.getItems().addAll(edititem1,edititem2,edititem3);
        
        
        
        MenuItem sourceitem1=new MenuItem("Toggle Comment");
        MenuItem sourceitem2=new MenuItem("Add Import");
        MenuItem sourceitem3=new MenuItem("Clean Up");
        menusource.getItems().addAll(sourceitem1,sourceitem2,sourceitem3);
       
       
       Pane pane=new Pane();
       pane.setPrefSize(900, 300);
     //  pane.getChildren().add(tableview);
       bp.setCenter(pane);

       
        
        
    	bp.setTop(menubar);
    }
}
