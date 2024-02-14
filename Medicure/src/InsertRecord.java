import Medicure.beans.Login;
import charges.beans.Charges;
import user.beans.Users;
import Medicure.beans.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class InsertRecord                        
{
    public static void main(String...ar)throws Exception
    {
        Configuration config=new Configuration();
        Configuration c1=config.configure();
        SessionFactory sf=c1.buildSessionFactory();
        
       //SessionFactory sf=new Configuration().configure().buildSessionFactory();
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
      // Login cmp=new Login(131232,"ABC123",'A',20,"Manas","188 sanchar nagar ext");
       //Charges chg=new Charges(323223,"Xray",2004404,200444,"good Software","no offers" );
       Users users=new Users("185 sanchar nagar",133213345,19,"indore",123453,43243224,"Manas","Rode","MRI","MP","India",' ');
      // session.save(cmp);
     //  session.save(chg);
       session.save(users);
       tx.commit();
       session.close();
       System.out.println("inserted!!!!!!!!!");
    }
}
