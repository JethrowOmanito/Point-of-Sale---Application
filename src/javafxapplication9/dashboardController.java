/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication9;


import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.File;
import java.net.URL;
import java.util.Optional;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.DatePicker;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.chart.XYChart;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Jethrow Cruz
 */
public class dashboardController implements Initializable{
    
    @FXML
    private Button Clear_order;
    
    @FXML
    private Button order_deletebtn;
    
    @FXML
    private ComboBox<?> order_paymentbtn;

    @FXML
    private ComboBox<?> order_fsbtn;
    @FXML
    private TableColumn<CustomerData, Date> order_col_date;

    
    @FXML
    private TableColumn<CustomerData, String> order_col_payment;
    
    @FXML
    private TableColumn<CustomerData, String> order_col_fs;
    
    @FXML
    private TableColumn<?,?> order_col_id;
    
    @FXML
    private AnchorPane AddProducts_form;

    @FXML
    private AnchorPane DTR_form;

    @FXML
    private Button addPD_btn;

    @FXML
    private Button addProducts_addBtn;

    @FXML
    private FontAwesomeIcon addProducts_btn;

    @FXML
    private Button addProducts_deleteBtn;

    @FXML
    private ImageView addProducts_imageView;

    @FXML
    private Button addProducts_importBtn;

    @FXML
    private TextField addProducts_productsid;

    @FXML
    private TextField addProducts_productsname;

    @FXML
    private TextField addProducts_productsprice;

    @FXML
    private TextField addProducts_productssearch;

    @FXML
    private ComboBox<?> addProducts_productstatus;

    @FXML
    private ComboBox<?> addProducts_productstype;

    @FXML
    private Button addProducts_resetBtn;

    @FXML
    private Button addProducts_updateBtn;

    @FXML
    private TableColumn<?, ?> add_col_pdID;

    @FXML
    private TableColumn<productData, String> add_col_pdName;
    
    @FXML
    private TableColumn<productData, String> add_col_pdStatus;

    @FXML
    private TableColumn<productData, Double> add_col_pdPrice;

    

    @FXML
    private TableColumn<productData, String> add_col_pdType;

    @FXML
    private AnchorPane add_form;

    @FXML
    private TableView<productData> add_tableView;

    @FXML
    private FontAwesomeIcon close;

    @FXML
    private Button close_btn;

    @FXML
    private Button dtr_btn;

    @FXML
    private TableColumn<EmployeeData, Date> dtr_col_date;

    @FXML
    private TableColumn<EmployeeData, String> dtr_col_name;

    @FXML
    private TableColumn<EmployeeData, String> dtr_col_position;

    @FXML
    private TableColumn<EmployeeData, String> dtr_col_shift;

    @FXML
    private TableColumn<EmployeeData, String> dtr_col_ti;

    @FXML
    private DatePicker dtr_date;

    @FXML
    private TextField dtr_name;

    @FXML
    private ComboBox<?> dtr_position;

    @FXML
    private ComboBox<?> dtr_shift;

    @FXML
    private Button dtr_submitbtn;

    @FXML
    private TextField dtr_timein;

    @FXML
    private TextField dtr_timeout;

    @FXML
    private TableColumn<EmployeeData, String> dtr_to;

    @FXML
    private Label home_availableProducts;

    @FXML
    private FontAwesomeIcon home_availprod;

    @FXML
    private Button home_btn;

    @FXML
    private AnchorPane home_form;

    @FXML
    private FontAwesomeIcon home_home;

    @FXML
    private AreaChart<?, ?> home_incomeChar;

    @FXML
    private Label home_numberOrder;

    @FXML
    private BarChart<?, ?> home_orderDataChart;

    @FXML
    private FontAwesomeIcon home_today_income;

    @FXML
    private FontAwesomeIcon home_today_order;

    @FXML
    private Label home_totalIncome;

    @FXML
    private FontAwesomeIcon home_user;

    @FXML
    private FontAwesomeIcon logout;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button minimize;

    @FXML
    private TextField order_amount;

    @FXML
    private Label order_balance;

    @FXML
    private Button order_btn;

    @FXML
    private Button order_cancelBtn;

    @FXML
    private TableColumn<CustomerData, String> order_col_pn;

    @FXML
    private TableColumn<CustomerData, String> order_col_price;

    @FXML
    private TableColumn<CustomerData, String> order_col_qty;

    @FXML
    private TableColumn<CustomerData, String> order_col_type;

    @FXML
    private AnchorPane order_form;

    @FXML
    private Button order_payBtn;

    @FXML
    private ComboBox<?> order_productName;

    @FXML
    private ComboBox<?> order_productType;

    @FXML
    private Spinner<Integer> order_qty;

    @FXML
    private Button order_receiptBtn;

    @FXML
    private Label order_total;

    @FXML
    private TableView<CustomerData> orders_tableView;

    @FXML
    private TableView<EmployeeData> orders_tableView1;

    @FXML
    private FontAwesomeIcon search_logo;

    @FXML
    private Label username;

      @FXML
    private Button order_addbtn;
      
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;

    private Image image;
      
    public ObservableList<EmployeeData> dtrListData() {

        ObservableList<EmployeeData> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM employee_pos";
        connect = database.connectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            EmployeeData dtrD;
            while (result.next()) {
                dtrD = new EmployeeData(result.getString("employee_name"),
                         result.getString("position"),
                         result.getString("shift"),
                         result.getString("timein"),
                         result.getString("timeout"),
                         result.getDate("date"));
                listData.add(dtrD);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listData;
    }
    
    private ObservableList<EmployeeData> dtrlist;
    
    public void dtrShowListData(){
        dtrlist = dtrListData();
        
       dtr_col_name.setCellValueFactory(new PropertyValueFactory<>("employee_name"));
       dtr_col_shift.setCellValueFactory(new PropertyValueFactory<>("shift"));
       dtr_col_position.setCellValueFactory(new PropertyValueFactory<>("position"));
       dtr_col_ti.setCellValueFactory(new PropertyValueFactory<>("timein"));
       dtr_to.setCellValueFactory(new PropertyValueFactory<>("timeout"));
       dtr_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
       
       
       orders_tableView1.setItems(dtrlist);
        
    }  
    private boolean newEntryAdded = false;
    public void dtrEmployee() {
    String sql = "INSERT INTO employee_pos (employee_name, shift, position, timein, timeout, date) VALUES (?, ?, ?, ?, ?, ?)";

    connect = database.connectDB();

    try {
        Alert alert;
        if (dtr_name.getText().isEmpty() ||
                dtr_shift.getSelectionModel().getSelectedItem() == null ||
                dtr_position.getSelectionModel().getSelectedItem() == null ||
                dtr_timein.getText().isEmpty() ||
                dtr_timeout.getText().isEmpty()) {

            // If the required fields are not filled, show an error message
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setContentText("Please Fill All Blank Fields");
            alert.showAndWait();
        } else {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1, dtr_name.getText());
            prepare.setString(2, (String) dtr_shift.getSelectionModel().getSelectedItem());
            prepare.setString(3, (String) dtr_position.getSelectionModel().getSelectedItem());
            prepare.setString(4, dtr_timein.getText());
            prepare.setString(5, dtr_timein.getText());

            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            prepare.setString(6, String.valueOf(sqlDate));

            prepare.executeUpdate();

            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setContentText("Successfully Updated");
            alert.showAndWait();

            // Clear input fields
            dtr_name.clear();
            dtr_shift.getSelectionModel().clearSelection();
            dtr_position.getSelectionModel().clearSelection();
            dtr_timein.clear();
            dtr_timeout.clear();

            // Update the list view in DTR panel
            dtrShowListData();
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

        
    
    public void addProductsAdd() {

        String sql = "INSERT INTO product (product_type,product_name,status,price,image,date)" + "VALUES(?,?,?,?,?,?)";

        connect = database.connectDB();

        try {
            Alert alert;
            if (    addProducts_productsname.getText().isEmpty()
                    || addProducts_productstatus.getSelectionModel().getSelectedItem() == null
                    || addProducts_productsprice.getText().isEmpty()
                    || getData.path == "") {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setContentText("Please Fill All Blank Fileds");
                alert.showAndWait();
            } else {

                String checkData = "SELECT product_name FROM product WHERE product_name = '" + addProducts_productsname.getText() + "'";
                statement = connect.createStatement();
                result = statement.executeQuery(checkData);

                if (result.next()) {

                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setContentText("Product Name:" + addProducts_productsname.getText() + " was already exist!");
                    alert.showAndWait();

                } else {

                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, (String) addProducts_productstype.getSelectionModel().getSelectedItem());
                    prepare.setString(2, addProducts_productsname.getText());
                    prepare.setString(3, (String) addProducts_productstatus.getSelectionModel().getSelectedItem());
                    prepare.setString(4, addProducts_productsprice.getText());
                    String uri = getData.path;
                    uri = uri.replace("\\", "\\\\");
                    prepare.setString(5, uri);

                    Date date = new Date();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                    prepare.setString(6, String.valueOf(sqlDate));

                    prepare.executeUpdate();

                    addProductShowListData();
                    addProductReset();
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try{
                if(connect !=null){
                    connect.close();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }

    }
    
    public void addProductsImporImage(){
          
          FileChooser open = new FileChooser();
          open.setTitle("Open Image File");
          open.getExtensionFilters().add(new ExtensionFilter("Image File", "*jpg", "*png"));
          
          File file = open.showOpenDialog(main_form.getScene().getWindow());
          
          if(file !=null){
              getData.path = file.getAbsolutePath();
              image = new Image(file.toURI().toString(),115,128,false,true);
              addProducts_imageView.setImage(image);
              
          }
          
      }
    
     private String[] dtr_listShift = {"Morning Shift", "Afternoon Shift", "Evening Shift"};
     public void dtrListType() {
        orderListProductName();
        List<String> listT = new ArrayList<>();

        for (String data : dtr_listShift) {
            listT.add(data);
        }
        ObservableList listData = FXCollections.observableArrayList(listT);
        dtr_shift.setItems(listData);
    }
    
     private String[] dtr_listPosition = {"Chef", "Cashier", "Waiter"};
     public void dtrListPosition() {
        orderListProductName();
        List<String> listT = new ArrayList<>();

        for (String data : dtr_listPosition) {
            listT.add(data);
        }
        ObservableList listData = FXCollections.observableArrayList(listT);
        dtr_position.setItems(listData);
    }

    
    public void addProductsUpdate(){
          String uri = getData.path;
          uri = uri.replace("\\", "\\\\");
          
          Date date = new Date();
          java.sql.Date sqlDate = new java.sql.Date(date.getTime());
          
          String sql = "UPDATE product SET product_type = '"+addProducts_productstype.getSelectionModel().getSelectedItem()
                          +"',status = '"+addProducts_productstatus.getSelectionModel().getSelectedItem()               
                          +"',price = '"+addProducts_productsprice.getText()
                          +"', image = '"+uri+"', date = '"+sqlDate+"' WHERE product_name = '" +addProducts_productsname.getText()+"'";
                          
                          connect = database.connectDB();
               
          try {
              Alert alert;
              if (addProducts_productstype.getSelectionModel().getSelectedItem() == null 
                      || addProducts_productsname.getText().isEmpty()
                      || addProducts_productstatus.getSelectionModel().getSelectedItem() == null
                      || addProducts_productsprice.getText().isEmpty() 
                      || getData.path == "") {

                  alert = new Alert(AlertType.ERROR);
                  alert.setTitle("Error Message");
                  alert.setContentText("Please Fill All Blank Fileds");
                  alert.showAndWait();
              } else {
                  alert = new Alert(AlertType.CONFIRMATION);
                  alert.setTitle("Confirmation Message");
                  alert.setHeaderText(null);
                  alert.setContentText("Are you sure you want to Update Product: " + addProducts_productsname.getText() + "?");
                  
                  Optional<ButtonType> option = alert.showAndWait();
                  
                  if(option.get().equals(ButtonType.OK)){
                      
                      statement = connect.createStatement();
                      statement.executeUpdate(sql);
                      
                      alert = new Alert(AlertType.INFORMATION);
                      alert.setTitle("Information Message");
                      alert.setContentText("Successfully Updated");
                      alert.showAndWait();
                      
                      addProductShowListData();
                      addProductReset();
                  }

              }
          } catch (SQLException ex) {
              ex.printStackTrace();
          }finally {
           try {
            if (connect != null) {
                connect.close();
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
                  
      }
  }
      
      
    public void addProductDelete(){
          String sql = "DELETE FROM product WHERE product_name = '"+addProducts_productsname.getText()+"'";
          
          connect = database.connectDB();
          try{
               Alert alert;
              if (addProducts_productstype.getSelectionModel().getSelectedItem() == null 
                      || addProducts_productsname.getText().isEmpty()
                      || addProducts_productstatus.getSelectionModel().getSelectedItem() == null
                      || addProducts_productsprice.getText().isEmpty() 
                      || getData.path == "") {

                  alert = new Alert(AlertType.ERROR);
                  alert.setTitle("Error Message");
                  alert.setContentText("Please Fill All Blank Fileds");
                  alert.showAndWait();
              } else {
                  alert = new Alert(AlertType.CONFIRMATION);
                  alert.setTitle("Confirmation Message");
                  alert.setHeaderText(null);
                  alert.setContentText("Are you sure you want to DELETE Product Name: " + addProducts_productsname.getText() + "?");
                  
                  Optional<ButtonType> option = alert.showAndWait();
                  
                  if(option.get().equals(ButtonType.OK)){
                      statement = connect.createStatement();
                      statement.executeUpdate(sql);
                      
                      alert = new Alert(AlertType.INFORMATION);
                      alert.setTitle("Information Message");
                      alert.setContentText("Successfully Deleted");
                      alert.showAndWait();
                      
                      addProductShowListData();
                      addProductReset();
                  }
              }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
      
      
    public void addProductReset(){
          addProducts_productstype.getSelectionModel().clearSelection();
          addProducts_productsname.setText("");
          addProducts_productstatus.getSelectionModel().clearSelection();
          addProducts_productsprice.setText("");
          addProducts_imageView.setImage(null);
          
          getData.path = "";
          
      }
      
      
    private String[] orderlistType = {"Ramen", "Drinks", "Side Dish"};
    
    public void ordersAdd(){
        Id();
        String sql = "INSERT INTO customer (type,productname,quantity,price,foodservice,Payment_Method,date)" 
                + "VALUES(?,?,?,?,?,?,?)";
        connect = database.connectDB();
        
        try{
            
            String checkData = "SELECT * FROM product WHERE product_name ='"+order_productName.getSelectionModel().getSelectedItem()+"'";
            
            double priceData = 0;
            
            statement = connect.createStatement();
            result = statement.executeQuery(checkData);
            if(result.next()){
                priceData = result.getDouble("price");
            }
            double totalPData = (priceData*qty);
            Alert alert;
            
            if(order_productType.getSelectionModel().getSelectedItem() == null
                    ||(String)order_productType.getSelectionModel().getSelectedItem() == null
                    ||(String)order_productName.getSelectionModel().getSelectedItem()==null
                    ||totalPData==0){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please choose product first");
                alert.showAndWait();
            }else{
                prepare = connect.prepareStatement(sql);
                
                prepare.setString(1, (String) order_productType.getSelectionModel().getSelectedItem());
                prepare.setString(2, (String) order_productName.getSelectionModel().getSelectedItem());
                prepare.setString(3, String.valueOf(qty));
                prepare.setString(4,String.valueOf(totalPData));
                prepare.setString(5, (String) order_fsbtn.getSelectionModel().getSelectedItem());
                prepare.setString(6, (String) order_paymentbtn.getSelectionModel().getSelectedItem());
                Date date = new Date();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                prepare.setString(7, String.valueOf(sqlDate));
                
                prepare.executeUpdate();
                 System.out.println("DEBUG: Order added successfully."); // Add this line for debugging
                
                orderList = orderListData();
                orders_tableView.setItems(orderList);
                orders_tableView.refresh(); // Refresh the TableView

                orderDisplayTotal();
            
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

   private double amountP;
   private double balanceP;
   public void orderAmount(){
       
       Alert alert;
       
       if(!order_amount.getText().isEmpty()){
       amountP = Double.parseDouble(order_amount.getText());
       
           if (totalP > 0) {

               if (amountP > totalP) {
                   balanceP = (amountP - totalP);

                   order_balance.setText("" + String.valueOf(balanceP));

               } else {
                   alert = new Alert(AlertType.ERROR);
                   alert.setHeaderText(null);
                   alert.setContentText("invalid");
                   alert.showAndWait();

                   order_amount.setText("");
               }

           } else {
               alert = new Alert(AlertType.ERROR);
               alert.setHeaderText(null);
               alert.setContentText("invalid");
               alert.showAndWait();
           }
       }else {
               alert = new Alert(AlertType.ERROR);
               alert.setHeaderText(null);
               alert.setContentText("invalid");
               alert.showAndWait();
           }
       
   }
   
    public void ordersPay() 
    {
        Id();
        String sql = "INSERT INTO customer_receipt (product_name, product_qty, price, Payment, foodservice, total_amount, Balance, date) VALUES(?,?,?,?,?,?,?,?)";

        connect = database.connectDB();

        try {
            Alert alert;
            if (totalP > 0 && !order_amount.getText().isEmpty() && amountP > 0) { // Updated condition
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.isPresent() && option.get().equals(ButtonType.OK)) {
                    prepare = connect.prepareStatement(sql);

                    prepare.setString(1, (String) order_productName.getSelectionModel().getSelectedItem());
                    prepare.setString(2, String.valueOf(qty));
                    prepare.setString(3, String.valueOf(totalP));
                    prepare.setString(4, (String) order_paymentbtn.getSelectionModel().getSelectedItem());
                    prepare.setString(5, (String) order_fsbtn.getSelectionModel().getSelectedItem());
                    prepare.setDouble(6, amountP);

                    // Calculate balanceP based on the difference between amountP and totalP
                    double balanceP = amountP - totalP;
                    prepare.setDouble(7, balanceP);

                    Date date = new Date();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    prepare.setString(8, String.valueOf(sqlDate));

                    prepare.executeUpdate();

                   

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successful!");
                    alert.showAndWait();

                } else {
                    return;
                }

            } else {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid");
                alert.showAndWait();
            }

        } catch (NumberFormatException nfe) {
            // Handle the NumberFormatException (empty string or invalid format)
            nfe.printStackTrace();
            // You can show an error message here if needed
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void clearDatabase() {
        String url = "jdbc:mysql://localhost:3306/possystem";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM customer_receipt";
            statement.executeUpdate(sql);

            statement.close();
            connection.close();

            // Provide user feedback that the database has been cleared
            System.out.println("Database cleared.");
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }
   public void orderReceipt() {
 
    String jrxmlFilePath = "C:\\Users\\Jethrow Cruz\\OneDrive\\Documents\\NetBeansProjects\\JavaFXApplication9\\src\\javafxapplication9\\report111122.jrxml";
  
    HashMap hash = new HashMap();
    hash.put("InventoryP", id);
    try {
        
        JasperDesign jDesign = JRXmlLoader.load(jrxmlFilePath);
        JasperReport jReport = JasperCompileManager.compileReport(jDesign);
        JasperPrint jprint = JasperFillManager.fillReport(jReport, hash, connect);
        JasperViewer.viewReport(jprint, false);
    } catch (Exception ex) {
        ex.printStackTrace();
        System.err.println("Exception message: " + ex.getMessage());
    }
}

   public void orderDelete() {
    CustomerData selectedOrder = orders_tableView.getSelectionModel().getSelectedItem();
    
    if (selectedOrder != null) {
        String sql = "DELETE FROM customer WHERE id = ?";
        
        connect = database.connectDB();
        
        try (PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
            preparedStatement.setInt(1, selectedOrder.getID());
            
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to Delete?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.isPresent() && option.get().equals(ButtonType.OK)) {
                preparedStatement.executeUpdate();
                
                orderShowListData();
                
                totalP = 0;
                balanceP = 0;
                amountP = 0;
                order_balance.setText("P.0");
                order_total.setText("P.0");
                order_amount.setText("P.0");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } else {
        // Show a message to inform the user to select an item for deletion
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning Message");
        alert.setHeaderText(null);
        alert.setContentText("Please select an item to delete.");
        alert.showAndWait();
    }
}


  
   public void orderCancel(){
       
          addProducts_productstype.getSelectionModel().clearSelection();
          order_productName.getSelectionModel().clearSelection();
          order_qty.getValueFactory().setValue(order_qty.getValueFactory().getConverter().fromString("0"));
          order_fsbtn.getSelectionModel().clearSelection();
          order_paymentbtn.getSelectionModel().clearSelection();
          order_total.setText("₱0.0");
          order_amount.setText("₱0.0");
          order_balance.setText("₱0.0");
          
       
   }



   public void homeIncomeChar(){
       home_incomeChar.getData().clear();
       
       String sql = "SELECT date, SUM(total_amount) FROM customer_receipt GROUP BY date ORDER BY TIMESTAMP(date) ASC LIMIT 6";
       
       connect = database.connectDB();
       
       try{
           XYChart.Series chart = new XYChart.Series();
           prepare = connect.prepareStatement(sql);
           result = prepare.executeQuery();
           
           while(result.next()){
               chart.getData().add(new XYChart.Data(result.getString(1),result.getInt(2)));
           }
           
           home_incomeChar.getData().add(chart);
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
   
   public void homeOrderChart(){
       home_orderDataChart.getData().clear();
       String sql = "SELECT date, COUNT(id) FROM customer GROUP BY date ORDER BY TIMESTAMP(date) ASC LIMIT 5";
       
       connect = database.connectDB();
       
       try{
           XYChart.Series chart = new XYChart.Series();
           prepare = connect.prepareStatement(sql);
           result = prepare.executeQuery();
           
           while(result.next()){
               chart.getData().add(new XYChart.Data(result.getString(1),result.getInt(2)));
               
           }
           home_orderDataChart.getData().add(chart);
       }catch(Exception ex){
           ex.printStackTrace();
       }
       
       
       
   }
   public void homeDisplayTotalOrder(){
       
       Date date = new Date();
       java.sql.Date sqlDate = new java.sql.Date(date.getTime());
       
       String sql = "SELECT COUNT(id) FROM customer WHERE date = '"+sqlDate+"'";
       connect = database.connectDB();
       
       int countOrders = 0;
       try{
           prepare = connect.prepareStatement(sql);
           result = prepare.executeQuery();
           
           while(result.next()){
               countOrders = result.getInt("COUNT(id)");
           }
           
           home_numberOrder.setText(String.valueOf(countOrders));
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
   public void homeTotalIncome(){
       String sql = "SELECT SUM(total_amount) FROM customer_receipt ";
       connect = database.connectDB();
       
       double totalIncome = 0;
       
       try{
           prepare = connect.prepareStatement(sql);
           result = prepare.executeQuery();
           
           while(result.next()){
               totalIncome  = result.getDouble("SUM(total_amount)");
               
           }
           home_totalIncome.setText("₱" + String.valueOf((totalIncome)));
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
  
   public void homeAvailableProducts(){
       String sql = "SELECT COUNT(id) FROM product WHERE status = 'Available'";
       connect = database.connectDB();
       
       int countAP = 0;
       
       try{
           prepare = connect.prepareStatement(sql);
           result = prepare.executeQuery();
           
           while(result.next()){
               countAP = result.getInt("COUNT(id)");
           }
           home_availableProducts.setText(String.valueOf(countAP));
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
    private double totalP;
    public void orderDisplayTotal(){
        Id();
        String sql = "SELECT SUM(price) FROM customer WHERE id = '"+id+"'";
        connect = database.connectDB();
        
        try{
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
             
            
            while(result.next()){
                totalP = result.getDouble("SUM(price)");
                 
            }
            
            order_total.setText("₱"+String.valueOf(totalP));
           
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void orderListType() {
        orderListProductName();
        List<String> listT = new ArrayList<>();

        for (String data : orderlistType) {
            listT.add(data);
        }
        order_total.setText(String.valueOf(totalP));

        ObservableList listData = FXCollections.observableArrayList(listT);
        order_productType.setItems(listData);
    }

    public void orderListProductName() {
        
        String sql = "SELECT * FROM product WHERE product_type = '" + order_productType.getSelectionModel().getSelectedItem() + "' and status = 'Available'";

        connect = database.connectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            ObservableList listData = FXCollections.observableArrayList();

            while (result.next()) {
                listData.add(result.getString("product_name"));
            }
            order_productName.setItems(listData);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private SpinnerValueFactory<Integer> spinner;
    
    public void orderSpinner(){
        spinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,20,0);
        order_qty.setValueFactory(spinner);
    }
    private int qty;  
    public void  orderShowSpinnerValue(){
         qty = order_qty.getValue();
    } 
      
    private String[] listType = {"Ramen", "Drinks", "Side Dish"};
    public void addProductListType() {
        List<String> listT = new ArrayList<>();

        for (String data : listType) {
            listT.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listT);
        addProducts_productstype.setItems(listData);
    }
    
    private String[] listPayment = {"Cash", "G-cash", "Card"};
    
    public void orderProductListPayment() {
        List<String> listT = new ArrayList<>();

        for (String data : listPayment) {
            listT.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listT);
        order_paymentbtn.setItems(listData);
    }
    private String[] listFS = {"Dine-in", "Take-out"};
    
    public void orderProductListFs() {
        List<String> listT = new ArrayList<>();

        for (String data : listFS) {
            listT.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listT);
        order_fsbtn.setItems(listData);
    }
      
    private String[] listStatus = {"Available", "Out of Stock"};

    public void addProductListStatus() {
        List<String> listS = new ArrayList<>();

        for (String data : listStatus) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
        addProducts_productstatus.setItems(listData);
    }
      
    public void addProductSearch() {
        FilteredList<productData> filter = new FilteredList<>(addProductList, e -> true);

        addProducts_productssearch.textProperty().addListener((Observable, oldValue, newValue) -> {

            filter.setPredicate(predicateProductData -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String searchKey = newValue.toLowerCase();

                if (predicateProductData.getProductType().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateProductData.getProductName().toLowerCase().contains(searchKey)) {
                    return true;
                } else {
                    return false;
                }
            });
        });

        SortedList<productData> sortList = new SortedList<>(filter);
        sortList.comparatorProperty().bind(add_tableView.comparatorProperty());
        add_tableView.setItems(sortList);
    }
    
    public ObservableList<productData> addProductsListData() {

        ObservableList<productData> productList = FXCollections.observableArrayList();
        String sql = "SELECT * FROM product";
        connect = database.connectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            productData prodD;
            while (result.next()) {
                prodD = new productData(result.getString("product_type"),
                         result.getString("product_name"),
                         result.getString("status"),
                         result.getDouble("price"),
                         result.getString("image"),
                         result.getDate("date"));
                productList.add(prodD);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return productList;
    }
    
    private ObservableList<productData> addProductList;
    
    public void addProductShowListData(){
        addProductList = addProductsListData();
        
       add_col_pdType.setCellValueFactory(new PropertyValueFactory<>("productType"));
       add_col_pdName.setCellValueFactory(new PropertyValueFactory<>("productName"));
       add_col_pdStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
       add_col_pdPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
       
       
       add_tableView.setItems(addProductList);
        
    }
    
    public void addProductsSelect(){
        productData prodD = add_tableView.getSelectionModel().getSelectedItem();
        int num = add_tableView.getSelectionModel().getSelectedIndex();
        
        if((num - 1) <- 1){
            return;
        }
        addProducts_productsname.setText(prodD.getProductName());
        addProducts_productsprice.setText(String.valueOf(prodD.getPrice()));
        
        String uri = "file:" + prodD.getImage();
        image = new Image(uri,115,128,false,true);
        addProducts_imageView.setImage(image);
        getData.path = prodD.getImage();
    }
    
    
    public ObservableList<CustomerData> orderListData() {
        ObservableList<CustomerData> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM customer";

        connect = database.connectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next() == true) {
                CustomerData customerD = new CustomerData(
                        result.getInt("id"),
                        result.getString("type"),
                        result.getString("productname"),
                        result.getInt("quantity"),
                        result.getDouble("price"),
                        result.getString("foodservice"),
                        result.getString("Payment_Method"),
                        result.getDate("date")
                );
                // Add each row to the list
                listData.add(customerD);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listData;
    }

    private ObservableList<CustomerData> orderList;

    public void orderShowListData() {
        orderList = orderListData();

        order_col_pn.setCellValueFactory(new PropertyValueFactory<>("productname"));
        order_col_qty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        order_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        order_col_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        order_col_fs.setCellValueFactory(new PropertyValueFactory<>("foodservice"));
        order_col_payment.setCellValueFactory(new PropertyValueFactory<>("payment"));
        order_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        orders_tableView.setItems(orderList);
        orderDisplayTotal();
    }
    
    private int id;
    public void Id(){
        String customerID = "SELECT id FROM customer";
        
        connect = database.connectDB();
        
        try{
           prepare = connect.prepareStatement(customerID);
           result = prepare.executeQuery();
           
           int checkID = 0;
           
           while(result.next()){
               id = result.getInt("id");
           }
           String checkData = "SELECT * FROM customer_receipt ";
           statement = connect.createStatement();
           result = statement.executeQuery(checkData);
           
           while(result.next()){
               checkID = result.getInt("id");
           }
          
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void switchForm(ActionEvent event){
        
        if(event.getSource() == home_btn){
            home_form.setVisible(true);
            AddProducts_form.setVisible(false);
            order_form.setVisible(false);
            DTR_form.setVisible(false);
            
            home_btn.setStyle("-fx-background-color:linear-gradient(to bottom right,#25a473,#89892b);");
            addPD_btn.setStyle("-fx-background-color:transparent");
            order_btn.setStyle("-fx-background-color:transparent");
            dtr_btn.setStyle("-fx-background-color:transparent");
            
             homeDisplayTotalOrder();
             homeTotalIncome();
             homeAvailableProducts();
             homeIncomeChar();
             homeOrderChart();
            
            
        }else if(event.getSource()==addPD_btn){
            home_form.setVisible(false);
            AddProducts_form.setVisible(true);
            order_form.setVisible(false); 
            DTR_form.setVisible(false);
            
           addProductShowListData();
           addProductListType();
           addProductListStatus();
           addProductSearch();
           
            
            
            addPD_btn.setStyle("-fx-background-color:linear-gradient(to bottom right,#25a473,#89892b);");
            home_btn.setStyle("-fx-background-color:transparent");
            order_btn.setStyle("-fx-background-color:transparent");
           dtr_btn.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() ==order_btn){
            home_form.setVisible(false);
            AddProducts_form.setVisible(false);
            order_form.setVisible(true);
            DTR_form.setVisible(false);
            
            order_btn.setStyle("-fx-background-color:linear-gradient(to bottom right,#25a473,#89892b);");
            addPD_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            dtr_btn.setStyle("-fx-background-color:transparent");
            

           orderListType();
           orderListProductName();
           orderSpinner();
           orderProductListFs();
           orderProductListPayment();
           orderCancel();
           
           

           
           
            
        }else if(event.getSource() ==dtr_btn){
            home_form.setVisible(false);
            AddProducts_form.setVisible(false);
            order_form.setVisible(false);
            DTR_form.setVisible(true);
            
            dtr_btn.setStyle("-fx-background-color:linear-gradient(to bottom right,#25a473,#89892b)");
            addPD_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            order_btn.setStyle("-fx-background-color:transparent");
            
            
            
            dtrListData();
            dtrShowListData();
            
            
            
            
            
        }
        
    }
    
    private double x = 0;
    private double y = 0;
    
    public void defaultNav(){
        home_btn.setStyle("-fx-background-color:linear-gradient(to bottom right,#25a473,#89892b);");
        
    }
    public void logout(){
        
        try{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Do You Want To Logout?");
            Optional<ButtonType> option = alert.showAndWait();
            
            if(option.get().equals(ButtonType.OK)){
                logout.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene (root);
                
        root.setOnMousePressed((MouseEvent event) -> {
        x = event.getSceneX();
        y = event.getSceneY();
        
    });
        root.setOnMouseDragged((MouseEvent event) -> {
         stage.setX(event.getScreenX() - x);
         stage.setY(event.getScreenY()-y);
        
         
         stage.setOpacity(.8);
    });
        
        root.setOnMouseReleased((MouseEvent event) -> {
        stage.setOpacity(1);
        
    });
        
      stage.initStyle(StageStyle.TRANSPARENT);  
      stage.setScene(scene);
      stage.show();
       
            }else return;
                    
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
 

   @FXML
   public void close(){
       System.exit(0);
   }

    public void minimize(){
        Stage stage = (Stage)main_form.getScene().getWindow();
        stage.setIconified(true);
    }
   

     public void displayUsername(){
        username.setText(getData.username);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        displayUsername();
        defaultNav();
        
        
         homeDisplayTotalOrder();
         homeTotalIncome();
         homeAvailableProducts();
         homeIncomeChar();
         homeOrderChart();

        
        addProductShowListData();
        addProductListStatus();
        addProductListType();
        
        
        orderListType();
        orderListProductName();
        orderSpinner();
        orderProductListFs();
        orderProductListPayment();
        orderShowListData();
        
        
        
         
         
         
         dtrListData();
         dtrListType();
         dtrListPosition();
         clearDatabase();
    }
    
}
