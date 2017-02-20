package com.example.valero.bookkeepingnciii;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by valero on 2/23/2016.
 */
public class QuizHelperhard extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 4;
    // Database Name
    private static final String DATABASE_NAME = "Quizhard";
    // tasks table name
    private static final String TABLE_QUESTHARD = "questhard";
    // tasks Table Columns names
    private static final String KEY_ID = "qidhard";
    private static final String KEY_QUESHARD = "hardquestion";
    private static final String KEY_ANSWERHARD = "answer"; // correct option
    private static final String KEY_OPTAHARD = "harda"; // option a
    private static final String KEY_OPTBHARD = "hardb"; // option b
    private static final String KEY_OPTCHARD = "hardc"; // option c
    private static final String KEY_CATEGORYHARD = "categoryHard";

    public static final String ACCNTING_BASIC = "ACCOUNTING BASIC";


    private SQLiteDatabase dbase;

    public QuizHelperhard(Context context) {
        super(context, Firstmenu.MAIN_DIR
                + File.separator + DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase.openOrCreateDatabase(Firstmenu.MAIN_DIR
                + File.separator + DATABASE_NAME, null);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTHARD + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUESHARD
                + " TEXT, " + KEY_ANSWERHARD + " TEXT, " + KEY_OPTAHARD + " TEXT, "
                + KEY_OPTBHARD + " TEXT, " + KEY_OPTCHARD + " TEXT, " + KEY_CATEGORYHARD + " TEXT)";
        db.execSQL(sql);
        addQuestion();
        // db.close();
    }

    private void addQuestion() {
//ACCOUNTING BASIC
        com.example.valero.bookkeepingnciii.Question q1 = new com.example.valero.bookkeepingnciii.Question("Under the accrual basis of accounting, expenses are reported in the accounting period when the", "Cash is paid", "Accounts payable", "Expense Matches The Revenues Or Is Used Up", "Expense Matches The Revenues Or Is Used Up", ACCNTING_BASIC);
        this.addQuestion(q1);
        com.example.valero.bookkeepingnciii.Question q2 = new com.example.valero.bookkeepingnciii.Question("Assets are usually reported on the balance sheet at which amount?", "Cost", "Current market value", "Expected selling price", "Cost", ACCNTING_BASIC);
        this.addQuestion(q2);
        com.example.valero.bookkeepingnciii.Question q3 = new com.example.valero.bookkeepingnciii.Question("Liabilities often have the word __________  in their account title. ", "Revenue", "Payable", "Cash", "Payable", ACCNTING_BASIC);
        this.addQuestion(q3);
        com.example.valero.bookkeepingnciii.Question q4 = new com.example.valero.bookkeepingnciii.Question("Accounting entries involve a minimum of how many accounts? ", "One", "Two", "Three", "Two", ACCNTING_BASIC);
        this.addQuestion(q4);
        com.example.valero.bookkeepingnciii.Question q5 = new com.example.valero.bookkeepingnciii.Question("Assets minus liabilities equals  ", "Drawing", "Capital", "Stockholder’s equity or owner’s equity ", "Stockholder’s equity or owner’s equity ", ACCNTING_BASIC);
        this.addQuestion(q5);
        com.example.valero.bookkeepingnciii.Question q6 = new com.example.valero.bookkeepingnciii.Question("When cash is received, the account Cash will be ", "Debited", "Credited", "Account Receivable", "Debited", ACCNTING_BASIC);
        this.addQuestion(q6);
        com.example.valero.bookkeepingnciii.Question q7 = new com.example.valero.bookkeepingnciii.Question("When a company pays a bill, the account Cash will be", "Debit", "Credit", "Accounts payable", "Credited", ACCNTING_BASIC);
        this.addQuestion(q7);
        com.example.valero.bookkeepingnciii.Question q8 = new com.example.valero.bookkeepingnciii.Question("Entries to expenses such as Rent Expense are usually", "Credits", "Adjusting entries", "Debits", "Debits", ACCNTING_BASIC);
        this.addQuestion(q8);
        com.example.valero.bookkeepingnciii.Question q9 = new com.example.valero.bookkeepingnciii.Question("Entries to revenues accounts such as Service Revenues are usually", "Net income", "Debit", "Service Income", "Credit", ACCNTING_BASIC);
        this.addQuestion(q9);
        com.example.valero.bookkeepingnciii.Question q10 = new com.example.valero.bookkeepingnciii.Question("What will usually cause the liability account Accounts Payable to increase?", "Debits", "Credits", "Both Debit and Credit", "Credits", ACCNTING_BASIC);
        this.addQuestion(q10);
//DEBIT AND CREDIT
        com.example.valero.bookkeepingnciii.Question q11 = new com.example.valero.bookkeepingnciii.Question("A company using the accrual method of accounting performed services on account in August. The services were for $2,000 and the company gave the customer credit terms that state the amount is to be paid to the company in September.\n" +
                "\n" + "Assuming that the company prepares monthly income statements, what will be the account debited for $2,000 in August?\n", "Cash", "Account receivable", "Service revenue", "Account receivable", "DEBIT AND CREDIT");
        this.addQuestion(q11);
        com.example.valero.bookkeepingnciii.Question q12 = new com.example.valero.bookkeepingnciii.Question("A company using the accrual method of accounting performed services on account in August. The services were for $2,000 and the company gave the customer credit terms that state the amount is to be paid to the company in September.\n" +
                "\n" + "Which account should the company credit for $2,000 in August?", "Cash ", "Account receivable", "Service revenue", "Service revenue","DEBIT AND CREDIT");
        this.addQuestion(q12);
        com.example.valero.bookkeepingnciii.Question q13 = new com.example.valero.bookkeepingnciii.Question("A company using the accrual method of accounting performed services on account in August. The services were for $2,000 and the company gave the customer credit terms that state the amount is to be paid to the company in September.\n" +
                "\n" + "In September when the company receives the $2,000 from the customer, which account should the company debit?", "Cash", "Account receivable", "Service revenue", "Cash","DEBIT AND CREDIT");
        this.addQuestion(q13);
        com.example.valero.bookkeepingnciii.Question q14 = new com.example.valero.bookkeepingnciii.Question("A company using the accrual method of accounting performed services on account in August. The services were for $2,000 and the company gave the customer credit terms that state the amount is to be paid to the company in September.\n"+
                "In September when the company receives the $2,000 from the customer, which account should the company credit?", "Cash", "Account receivable", "Service revenue", "Account receivable","DEBIT AND CREDIT");
        this.addQuestion(q14);
        com.example.valero.bookkeepingnciii.Question q15 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance  of :  ACCOUNTS PAYABLE ", "Debit", "Credit", "", "Credit","DEBIT AND CREDIT");
        this.addQuestion(q15);
        com.example.valero.bookkeepingnciii.Question q16 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance of : CASH ", "Debit", "Credit", "", "Debit","DEBIT AND CREDIT");
        this.addQuestion(q16);
        com.example.valero.bookkeepingnciii.Question q17 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance of : CAPITAL", "Debit", "Credit", "", "Credit","DEBIT AND CREDIT");
        this.addQuestion(q17);
        com.example.valero.bookkeepingnciii.Question q18 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance of : SUPPLIES", "Debit", "Credit", "", "Debit","DEBIT AND CREDIT");
        this.addQuestion(q18);
        com.example.valero.bookkeepingnciii.Question q19 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance of : PREPAID INSURANCE", "Debit", "Credit", "", "Debit","DEBIT AND CREDIT");
        this.addQuestion(q19);
        com.example.valero.bookkeepingnciii.Question q20 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance of : SERVICE REVENUE", "Debit", "Credit", "", "Credit","DEBIT AND CREDIT");
        this.addQuestion(q20);

//CHART OF ACCOUNT
        com.example.valero.bookkeepingnciii.Question q21 = new com.example.valero.bookkeepingnciii.Question("The chart of accounts has a list of:", "Names of customers and suppliers", "General ledger account names and numbers", "Names of each inventory item", "General ledger account names and numbers", "CHART OF ACCOUNT");
        this.addQuestion(q21);
        com.example.valero.bookkeepingnciii.Question q22 = new com.example.valero.bookkeepingnciii.Question("Name the five main categories that the ledger accounts are grouped under:", "Assets, credit cards, liabilities, money, contact cards ", "Assets, production, bank register, purchases, sales", "Assets, liabilities, equity, income, expenses", "Assets, liabilities, equity, income, expenses", "CHART OF ACCOUNT");
        this.addQuestion(q22);
        com.example.valero.bookkeepingnciii.Question q23 = new com.example.valero.bookkeepingnciii.Question("Which category usually has (but not always!) the most accounts?", "The banking corporation", "The 10 richest people of the world", "Expenses", "Expenses", "CHART OF ACCOUNT");
        this.addQuestion(q23);
        com.example.valero.bookkeepingnciii.Question q24 = new com.example.valero.bookkeepingnciii.Question("What equation does the chart of accounts tie-in with?", "Accounting equation", "Wave equation", "The origin of complex numbers", "Accounting equation", "CHART OF ACCOUNT");
        this.addQuestion(q24);
        com.example.valero.bookkeepingnciii.Question q25 = new com.example.valero.bookkeepingnciii.Question("Which category do you think an insurance loan would go under?", "Asset", "Liabilities", "Expenses", "Liabilities", "CHART OF ACCOUNT");
        this.addQuestion(q25);
        com.example.valero.bookkeepingnciii.Question q26 = new com.example.valero.bookkeepingnciii.Question("Under which category do you think a new, high cost computer would go ? ", "Expenses", "Income", "Asset", "Asset", "CHART OF ACCOUNT");
        this.addQuestion(q26);
        com.example.valero.bookkeepingnciii.Question q27 = new com.example.valero.bookkeepingnciii.Question("Which category do you think business Travel & Accommodation costs would go under?", "Expenses", "Liabilities", "Equity", "Expenses", "CHART OF ACCOUNT");
        this.addQuestion(q27);
        com.example.valero.bookkeepingnciii.Question q28 = new com.example.valero.bookkeepingnciii.Question("Which category do you think wages would go under?", "Equity", "Expenses", "Income", "Expenses", "CHART OF ACCOUNT");
        this.addQuestion(q28);
        com.example.valero.bookkeepingnciii.Question q29 = new com.example.valero.bookkeepingnciii.Question("Which category do you think the website development costs would go under?", "Asset", "Expenses", "Equity", "Asset", "CHART OF ACCOUNT");
        this.addQuestion(q29);
        com.example.valero.bookkeepingnciii.Question q30 = new com.example.valero.bookkeepingnciii.Question("A customer pays a deposit for work not yet started. Where does this go?", "Income", "Asset", "Equity", "Asset","CHART OF ACCOUNT");
        this.addQuestion(q30);

//BOOKKEEPING
        com.example.valero.bookkeepingnciii.Question q31 = new com.example.valero.bookkeepingnciii.Question("A listing of the balances in the accounts in order to determine whether debits are equal to credits is a __________ .", "Balance sheet", "Trial balance", "General ledger", "Trial balance", "BOOKKEEPING");
        this.addQuestion(q31);
        com.example.valero.bookkeepingnciii.Question q32 = new com.example.valero.bookkeepingnciii.Question("The listing of accounts that are available for posting transactions is the \n" +"__________  of accounts. \n", "Chart ", "Financial", "Basic", "Chart", "BOOKKEEPING");
        this.addQuestion(q32);
        com.example.valero.bookkeepingnciii.Question q33 = new com.example.valero.bookkeepingnciii.Question("When a sale is made on credit, the seller will debit the asset account Accounts \n" +
                "__________.\n", "Payable", "Receivable", "Cash", "Receivable", "BOOKKEEPING");
        this.addQuestion(q33);
        com.example.valero.bookkeepingnciii.Question q34 = new com.example.valero.bookkeepingnciii.Question("Asset,  __________ , and stockholders' equity accounts are known as balance sheet accounts."
                , "Owners equity", "Liability", "Equity", "Liability", "BOOKKEEPING");
        this.addQuestion(q34);
        com.example.valero.bookkeepingnciii.Question q35 = new com.example.valero.bookkeepingnciii.Question("The separation of duties is part of the internal __________  for safeguarding assets.", "Safety", "Controls", "Guard", "Credit", "BOOKKEEPING");
        this.addQuestion(q35);
        com.example.valero.bookkeepingnciii.Question q36 = new com.example.valero.bookkeepingnciii.Question("Cash and Accounts Receivable are two examples of accounts that are reported on the classified balance sheet under the heading  ________ asset. ", "Fixed", "Current", "None-current", "Current", "BOOKKEEPING");
        this.addQuestion(q36);
        com.example.valero.bookkeepingnciii.Question q37 = new com.example.valero.bookkeepingnciii.Question("A __________ entry typically removes an accrual-type adjusting entry that had been recorded in the preceding accounting period. ", "Reconciliation", "Reversing", "Recording", "Reversing", "BOOKKEEPING");
        this.addQuestion(q37);
        com.example.valero.bookkeepingnciii.Question q38 = new com.example.valero.bookkeepingnciii.Question("The difference between the balance in a company's cash account and its bank statement is documented in the __________ of the bank statement. ", "Reconciliation", "Reversing", "Recording", "Reconciliation", "BOOKKEEPING");
        this.addQuestion(q38);
        com.example.valero.bookkeepingnciii.Question q39 = new com.example.valero.bookkeepingnciii.Question("The bookkeeping or accounting equation is Assets = Liabilities + Owner's \n" +
                "__________ . \n", "Income", "Equity", "Capital", "Equity", "BOOKKEEPING");
        this.addQuestion(q39);
        com.example.valero.bookkeepingnciii.Question q40 = new com.example.valero.bookkeepingnciii.Question("Large corporations should report revenues on their income statements when the __________.", "Cash is received", "Revenues are earned", "Cash is unreceived", "Revenues are earned", "BOOKKEEPING");
        this.addQuestion(q40);
//ACCOUNTING EQUATION
        com.example.valero.bookkeepingnciii.Question q41 = new com.example.valero.bookkeepingnciii.Question("ABC purchases $100 worth of office supplies for inventory and stores them in their storage room. The office supply store gives them an invoice that allows them to pay for them in 15 days (on account).", "Asset increase and Liabilities increase", "Asset decrease and Liabilities decrease", "Owners equity decrease and Asset decrease", "Asset increase and Liabilities Increase","ACCOUNTING EQUATION");
        this.addQuestion(q41);
        com.example.valero.bookkeepingnciii.Question q42 = new com.example.valero.bookkeepingnciii.Question("ABC places an ad in the local newspaper receives the invoice from the supplier and writes a check for $25 to the newspaper.", "Owners equity increase and Liabilities decrease ", "Owners equity decrease and Asset decrease\"Asset increase and Liabilities increase", "Service revenue", "Owners equity decrease and Asset decrease","ACCOUNTING EQUATION");
        this.addQuestion(q42);
        com.example.valero.bookkeepingnciii.Question q43 = new com.example.valero.bookkeepingnciii.Question("The owner withdraws cash from the business for personal use : Owner's (or Stockholders') Equity ", "Increase", "Decrease", "No effect", "Decrease","ACCOUNTING EQUATION");
        this.addQuestion(q43);
        com.example.valero.bookkeepingnciii.Question q44 = new com.example.valero.bookkeepingnciii.Question("The company receives cash from a bank loan : Liabilities ", "Increase", "Decrease", "No effect", "Increase","ACCOUNTING EQUATION");
        this.addQuestion(q44);
        com.example.valero.bookkeepingnciii.Question q45 = new com.example.valero.bookkeepingnciii.Question("The company purchases equipment with its cash : Asset ", "Increase", "Decrease", "No effect", "Increase","ACCOUNTING EQUATION");
        this.addQuestion(q45);
        com.example.valero.bookkeepingnciii.Question q46 = new com.example.valero.bookkeepingnciii.Question("ABC purchases five mowers for $10,000 and finances them with a note from the local bank. ", "Asset decrease and Liabilities increase", "Asset increase and Owners equity increase", "Asset increase and Liabilities increase", "Asset increase and Liabilities increase","ACCOUNTING EQUATION");
        this.addQuestion(q46);
        com.example.valero.bookkeepingnciii.Question q47 = new com.example.valero.bookkeepingnciii.Question("The company purchases land by paying half in cash and signing a note payable for the other half : Owner's (or Stockholders') Equity", "Increase", "Decrease", "No effect", "No effect","ACCOUNTING EQUATION");
        this.addQuestion(q47);
        com.example.valero.bookkeepingnciii.Question q48 = new com.example.valero.bookkeepingnciii.Question("ABC places an ad in the local newspaper receives the invoice from the supplier and writes a check for $25 to the newspaper.", "Asset increase and Owners equity increase", "Owner equity decrease and Asset decrease", "", "Owners equity decrease and Assets decrease ","ACCOUNTING EQUATION");
        this.addQuestion(q48);
        com.example.valero.bookkeepingnciii.Question q49 = new com.example.valero.bookkeepingnciii.Question("Company X provides consulting services to Client Q in May. Company X bills Client Q in May for the agreed upon amount of $5,000. The sales invoice shows that the amount will be due in June.\n" +
                "\" +In June, Company X receives the $5,000. What is the effect on the accounting equation and which accounts are affected at Company X? Liabilities", "Increase", "Decrease", "No effect", "No effect","ACCOUNTING EQUATION");
        this.addQuestion(q49);
        com.example.valero.bookkeepingnciii.Question q50 = new com.example.valero.bookkeepingnciii.Question("ABC purchases five mowers for $10,000 and finances them with a note from the local bank.", "Owners equity increase and liabilities decrease", "Asset decrease and Owners equity decrease", "", "Asset increase and Liabilities increase","ACCOUNTING PRINCIPLES");
        this.addQuestion(q50);
//ACCOUNTING PRINCIPLES
        com.example.valero.bookkeepingnciii.Question q51 = new com.example.valero.bookkeepingnciii.Question("A very large corporation's financial statements have the dollar amounts rounded to the nearest $1,000. Which accounting principle/guideline justifies not reporting the amounts to the penny?", "Full disclosure", "Materiality", "Monetary unit", "Materiality","ACCOUNTING PRINCIPLE");
        this.addQuestion(q51);
        com.example.valero.bookkeepingnciii.Question q52 = new com.example.valero.bookkeepingnciii.Question("When the accountant has to choose between two acceptable alternatives, the accountant should select the alternative that will report less profit, less asset amount, or a greater liability amount. This is based upon which principle/guideline?", "Conservatism ", "Cost", "Materiality", "Conservatism","ACCOUNTING PRINCIPLES");
        this.addQuestion(q52);
        com.example.valero.bookkeepingnciii.Question q53 = new com.example.valero.bookkeepingnciii.Question("Public utilities' balance sheets list the plant assets before the current assets. This is acceptable under which accounting principle/guideline?", "Conservatism", "Cost", "Industry practices", "Industry practices","ACCOUNTING PRINCIPLE");
        this.addQuestion(q53);
        com.example.valero.bookkeepingnciii.Question q54 = new com.example.valero.bookkeepingnciii.Question("A large company purchases a $250 digital camera and expenses it immediately instead of recording it as an asset and depreciating it over its useful life. This practice may be acceptable because of which principle/guideline?", "Cost", "Matching", "Materiality", "Materiality","ACCOUNTING PRINCIPLE");
        this.addQuestion(q54);
        com.example.valero.bookkeepingnciii.Question q55 = new com.example.valero.bookkeepingnciii.Question("A corporation pays its annual property tax bill of approximately $12,000 in one payment each December 28. During the year, the corporation's monthly income statements report Property Tax Expense of $1,000. This is an example of which accounting principle/guideline?", "Conservatism", "Matching", "Monetary unit", "Matching","ACCOUNTING PRINCIPLE");
        this.addQuestion(q55);
        com.example.valero.bookkeepingnciii.Question q56 = new com.example.valero.bookkeepingnciii.Question("A company sold merchandise of $8,000 to a customer in December. The company's sales terms require the customer to pay the company in 30 days. The company's income statement reported the sale in December. This is proper under which accounting principle/guideline? ", "Full disclosure", "Monetary unit", "Revenue recognition", "Revenue recognition","ACCOUNTING PRINCIPLE");
        this.addQuestion(q56);
        com.example.valero.bookkeepingnciii.Question q57 = new com.example.valero.bookkeepingnciii.Question("The creative chief executive of a corporation who is personally responsible for numerous inventions and innovations is not reported as an asset on the corporation's balance sheet. The accounting principle/guideline that prevents the corporation for reporting this person as an asset is", "Conservatism", "Cost", "Going concern", "Cost","ACCOUNTING PRINCIPLE");
        this.addQuestion(q57);
        com.example.valero.bookkeepingnciii.Question q58 = new com.example.valero.bookkeepingnciii.Question("An asset with a cost of $120,000 is depreciated over its useful life of 10 years rather than expensing the entire amount when it is purchased. This complies with which principle/guideline?", "Cost", "Full disclosure", "Matching", "Matching","ACCOUNTING PRINCIPLE");
        this.addQuestion(q58);
        com.example.valero.bookkeepingnciii.Question q59 = new com.example.valero.bookkeepingnciii.Question("Near the end of the current year, a company required a customer to pay $200,000 as a deposit for work that is to begin in the following year. At the end of the current year the company reported the $200,000 as a liability on its balance sheet. Which accounting principle/guideline prevented the company from reporting the $200,000 on its income statement for the current year?", "Going concern", "Materiality", "Revue recognition", "Revenue recognition","ACCOUNTING PRINCIPLE");
        this.addQuestion(q59);
        com.example.valero.bookkeepingnciii.Question q60 = new com.example.valero.bookkeepingnciii.Question("A company borrowed $100,000 in December and will make its only payment for interest when the note comes due six months later. The total interest for the six months will be $3,600. On the December income statement the accountant reported Interest Expense of $600. This action was the result of which accounting principle/guideline?", "Cost", "Matching", "Revenue recognition", "Matching","ACCOUNTING PRINCIPLE");
        this.addQuestion(q60);
//FINANCIAL ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q61 = new com.example.valero.bookkeepingnciii.Question("The U.S. government agency with authority over the financial reporting requirements of publicly traded corporations is the __________.", "AICPA", "FASB", "SEC", "SEC","FINANCIAL ACCOUNTING");
        this.addQuestion(q61);
        com.example.valero.bookkeepingnciii.Question q62 = new com.example.valero.bookkeepingnciii.Question("The non-government organization that researches and develops new accounting standards is the __________.", "FASB ", "AICPA", "SEC", "FASB","FINANCIAL ACCOUNTING");
        this.addQuestion(q62);
        com.example.valero.bookkeepingnciii.Question q63 = new com.example.valero.bookkeepingnciii.Question("Which financial statement uses the expanded accounting equation?", "Income statement", "Balance sheet", "Cash flow statement", "Balance sheet","FINANCIAL ACCOUNTING");
        this.addQuestion(q63);
        com.example.valero.bookkeepingnciii.Question q64 = new com.example.valero.bookkeepingnciii.Question("The accrual basis of accounting records revenues when they are:", "Collected", "Earned", "Contracted", "Earned","FINANCIAL ACCOUNTING");
        this.addQuestion(q64);
        com.example.valero.bookkeepingnciii.Question q65 = new com.example.valero.bookkeepingnciii.Question("The account format that displays debits, credits, balances, and headings.", "General Journal", "General Ledger", "T-account", "T-account","FINANCIAL ACCOUNTING");
        this.addQuestion(q65);
        com.example.valero.bookkeepingnciii.Question q66 = new com.example.valero.bookkeepingnciii.Question("The profitability of a company for a specified period of time is reported on the __________ statement. ", "Expenses", "Income", "Drawing", "Income","FINANCIAL ACCOUNTING");
        this.addQuestion(q66);
        com.example.valero.bookkeepingnciii.Question q67 = new com.example.valero.bookkeepingnciii.Question("Prepaid insurance is reported as an __________on a company's balance sheet", "Asset", "Liabilities", "Capital", "Asset","FINANCIAL ACCOUNTING");
        this.addQuestion(q67);
        com.example.valero.bookkeepingnciii.Question q68 = new com.example.valero.bookkeepingnciii.Question("Which account increases equity?", "Expenses", "Withdrawals", "Revenues", "Revenues","FINANCIAL ACCOUNTING");
        this.addQuestion(q68);
        com.example.valero.bookkeepingnciii.Question q69 = new com.example.valero.bookkeepingnciii.Question("The main components or elements of the income statement are __________,expenses, gains, and losses. ", "Expenses", "Revenues", "Net income", "Revenues","FINANCIAL ACCOUNTING");
        this.addQuestion(q69);
        com.example.valero.bookkeepingnciii.Question q70 = new com.example.valero.bookkeepingnciii.Question("The statement of cash flows explains the changes in cash and cash __________ during the specified time interval. ", "Equal", "Percentage", "Equivalent", "Equivalent","FINANCIAL ACCOUNTING");
        this.addQuestion(q70);
//ADJUSTING ENTRIES
        com.example.valero.bookkeepingnciii.Question q71 = new com.example.valero.bookkeepingnciii.Question("The principle which dictates that efforts be matched with accomplishments is the:", "Matching principle", "Cost principle", "Periodicity principle", "Matching principle","ADJUSTING ENTRIES");
        this.addQuestion(q71);
        com.example.valero.bookkeepingnciii.Question q72 = new com.example.valero.bookkeepingnciii.Question("A bank lent $100,000 to a customer on December 1 that required the customer to pay an annual percentage rate (APR) of 12% on the amount of the loan. The loan is due in six months and no payment of interest or principal is to be made until the note is due on May 31. The bank prepares monthly financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that the bank will be making for its accounting records." +
                "What date should be used to record the December adjusting entry?", "December 1 ", "May 31", "December 31", "December 31","ADJUSTING ENTRIES");
        this.addQuestion(q72);
        com.example.valero.bookkeepingnciii.Question q73 = new com.example.valero.bookkeepingnciii.Question("A bank lent $100,000 to a customer on December 1 that required the customer to pay an annual percentage rate (APR) of 12% on the amount of the loan. The loan is due in six months and no payment of interest or principal is to be made until the note is due on May 31. The bank prepares monthly financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that the bank will be making for its accounting records." +
                "How many accounts are involved in the adjusting entry?", "One", "Two", "Three", "Two","");
        this.addQuestion(q73);
        com.example.valero.bookkeepingnciii.Question q74 = new com.example.valero.bookkeepingnciii.Question("A bank lent $100,000 to a customer on December 1 that required the customer to pay an annual percentage rate (APR) of 12% on the amount of the loan. The loan is due in six months and no payment of interest or principal is to be made until the note is due on May 31. The bank prepares monthly financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that the bank will be making for its accounting records." +
                "What is the name of the account that should be debited?", "Account receivable", "Interest income", "Interest receivable", "Interest receivable","ADJUSTING ENTRIES");
        this.addQuestion(q74);
        com.example.valero.bookkeepingnciii.Question q75 = new com.example.valero.bookkeepingnciii.Question("A company borrowed $100,000 on December 1 by signing a six-month note that specifies interest at an annual percentage rate (APR) of 12%. No interest or principal payment is due until the note matures on May 31. The company prepares financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that should be entered in the company's records." +
                "What date should be used to record the December adjusting entry?", "December 31", "May 31", "January 1", "December 31","ADJUSTING ENTRIES");
        this.addQuestion(q75);
        com.example.valero.bookkeepingnciii.Question q76 = new com.example.valero.bookkeepingnciii.Question(" A company borrowed $100,000 on December 1 by signing a six-month note that specifies interest at an annual percentage rate (APR) of 12%. No interest or principal payment is due until the note matures on May 31. The company prepares financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that should be entered in the company's records." +
                "How many accounts are involved in the adjusting entry?", "One", "Two", "Three", "Two","ADJUSTING ENTRIES");
        this.addQuestion(q76);
        com.example.valero.bookkeepingnciii.Question q77 = new com.example.valero.bookkeepingnciii.Question("A company borrowed $100,000 on December 1 by signing a six-month note that specifies interest at an annual percentage rate (APR) of 12%. No interest or principal payment is due until the note matures on May 31. The company prepares financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that should be entered in the company's records." +
                "What is the name of the account that will be debited?", "Interest income", "Interest expense", "Interest receivable", "Interest expenses","ADJUSTING ENTRIES");
        this.addQuestion(q77);
        com.example.valero.bookkeepingnciii.Question q78 = new com.example.valero.bookkeepingnciii.Question("A company borrowed $100,000 on December 1 by signing a six-month note that specifies interest at an annual percentage rate (APR) of 12%. No interest or principal payment is due until the note matures on May 31. The company prepares financial statements at the end of each calendar month. The following questions pertain to the adjusting entry that should be entered in the company's records." +
                "What is the name of the account that will be credited?", "Interest accounts payable", "Interest  notes payable", "Interest payable", "Interest payable",",");
        this.addQuestion(q78);
        com.example.valero.bookkeepingnciii.Question q79 = new com.example.valero.bookkeepingnciii.Question("A purchase of office supplies that was recorded in the Office Equipment account would require a correcting entry that.", "Credit cash", "Debits office equipment", "Credit office equipment", "Credit office equipment","ADJUSTING ENTRIES");
        this.addQuestion(q79);
        com.example.valero.bookkeepingnciii.Question q80 = new com.example.valero.bookkeepingnciii.Question("Reduction in a receivable or a payable that is granted if it is paid within the discount period.", "Cash discount", "Trade discount", "Discount cash", "Discount cash","ADJUSTING ENTRIES");
        this.addQuestion(q80);
//BALANCE SHEET
        com.example.valero.bookkeepingnciii.Question q81 = new com.example.valero.bookkeepingnciii.Question("Which of the following is a category or element of the balance sheet?", "Expenses", "Gains", "Liabilities", "Liabilities","BALANCE SHEET");
        this.addQuestion(q81);
        com.example.valero.bookkeepingnciii.Question q82 = new com.example.valero.bookkeepingnciii.Question("Which of the following is an asset account?", "Accounts payable ", "Prepaid insurance", "Unearned revenue", "Prepaid insurance","BALANCE SHEET");
        this.addQuestion(q82);
        com.example.valero.bookkeepingnciii.Question q83 = new com.example.valero.bookkeepingnciii.Question("Which of the following is a contra account?", "Accumulated depreciation", "Mary Smith Capital", "Depreciation", "Accumulated depreciation","BALANCE SHEET");
        this.addQuestion(q83);
        com.example.valero.bookkeepingnciii.Question q84 = new com.example.valero.bookkeepingnciii.Question("When an owner draws $5,000 from a sole proprietorship or when a corporation declares and pays a $5,000 dividend, the asset Cash decreases by $5,000. What is the other effect on the balance sheet?", "Owner's/Stockholders' Equity Decreases ", "None", "Decrease Assets ", "Owner's/Stockholders' Equity Decreases","BALANCE SHEET");
        this.addQuestion(q84);
        com.example.valero.bookkeepingnciii.Question q85 = new com.example.valero.bookkeepingnciii.Question("Which of the following would not be a current asset?", "Account receivable", "Land", "Supplies", "Land","BALANCE SHEET");
        this.addQuestion(q85);
        com.example.valero.bookkeepingnciii.Question q86 = new com.example.valero.bookkeepingnciii.Question("ABC Co. incurs cleanup expense of $500 on December 30. The supplier's invoice states that the $500 is due by January 10 and ABC will pay the invoice on January 9. ABC follows the accrual basis of accounting and its accounting year ends on December 31. What is the effect of the cleanup service on the December balance sheet of ABC? ", "Asset decrease", "Liabilities increase", "No effects on Owners equity", "Liabilities increase","BALANCE SHEET");
        this.addQuestion(q86);
        com.example.valero.bookkeepingnciii.Question q87 = new com.example.valero.bookkeepingnciii.Question("On December 1, ABC Co. hired Juanita Perez to begin working on January 2 at a monthly salary of $4,000. ABC's balance sheet of December 31 will show a liability of", "$4,000 ", "$48,000 ", "No Liability", "No Liability ","BALANCE SHEET");
        this.addQuestion(q87);
        com.example.valero.bookkeepingnciii.Question q88 = new com.example.valero.bookkeepingnciii.Question("Deferred credits will appear on the balance sheet with the", "Asset", "Liabilities", "Owner's/Stockholders' Equity ", "Liabilities","BALANCE SHEET");
        this.addQuestion(q88);
        com.example.valero.bookkeepingnciii.Question q89 = new com.example.valero.bookkeepingnciii.Question("ABC Co. has current assets of $50,000 and total assets of $150,000. ABC has current liabilities of $30,000 and total liabilities of $80,000. What is the amount of ABC's owner's equity?", "$20,000", "$30,000", "$70,000 ", "$70,000","BALANCE SHEET");
        this.addQuestion(q89);
        com.example.valero.bookkeepingnciii.Question q90 = new com.example.valero.bookkeepingnciii.Question("Notes Payable could not appear as a line on the balance sheet in which classification?", "Current asset", "Current liabilities", "long-term Liabilities", "Current asset","BALANCE SHEET");
        this.addQuestion(q90);

//INCOME STATEMENT
        com.example.valero.bookkeepingnciii.Question q91 = new com.example.valero.bookkeepingnciii.Question("Which of the following names is NOT associated with the income statement? ", "P & L ", "Statement Of Financial Position", "Statement Of Operations", "Statement Of Financial Position ","INCOME STATEMENT");
        this.addQuestion(q91);
        com.example.valero.bookkeepingnciii.Question q92 = new com.example.valero.bookkeepingnciii.Question("A company disposes of equipment that it no longer uses in its business. The amount received by the company is more than the amount the asset is carried at in the accounting records. The company will report a(n) ", "Expense ", "Gain", "Loss", "Gain","INCOME STATEMENT");
        this.addQuestion(q92);
        com.example.valero.bookkeepingnciii.Question q93 = new com.example.valero.bookkeepingnciii.Question("Is a retailer's Interest Expense an operating expense or a non-operating expense? ", "Operating expenses", "Non-operating expenses", "Operating income", "No-operating expenses","INCOME STATEMENT");
        this.addQuestion(q93);
        com.example.valero.bookkeepingnciii.Question q94 = new com.example.valero.bookkeepingnciii.Question("A gain or loss that is unusual in nature and infrequent in occurrence is a(n)", "Discounted operation", "Extra ordinary item", "Change in accounting principle", "Discontinued Operation","INCOME STATEMENT");
        this.addQuestion(q94);
        com.example.valero.bookkeepingnciii.Question q95 = new com.example.valero.bookkeepingnciii.Question ("Interest earned on investments would appear in which section of a retailer's multiple-step income statement? ", "Non-operating", "Operating", "Would not appear", "None-operating","INCOME STATEMENT");
        this.addQuestion(q95);
        com.example.valero.bookkeepingnciii.Question q96 = new com.example.valero.bookkeepingnciii.Question("The income statement line gross profit will appear on which income statement format?", "Single-step ", "Multiple-step ", "Triple-step", "Multiple-step","INCOME STATEMENT");
        this.addQuestion(q96);
        com.example.valero.bookkeepingnciii.Question q97 = new com.example.valero.bookkeepingnciii.Question("Net Sales minus the Cost of Goods Sold equals ", "Gross profit", "Income form operation", "Net income", "Gross profit","INCOME STATEMENT");
        this.addQuestion(q97);
        com.example.valero.bookkeepingnciii.Question q98 = new com.example.valero.bookkeepingnciii.Question("The combination of Selling Expenses and Administrative Expenses is referred to as", "General expenses", "Total expenses", "Operating expenses", "Operating Expenses","INCOME STATEMENT");
        this.addQuestion(q98);
        com.example.valero.bookkeepingnciii.Question q99 = new com.example.valero.bookkeepingnciii.Question("When a company changes its book depreciation from an accelerated method to the straight-line method, it is considered to be a(n)", "Discontinue operation", "Extraordinary item", "Change in accounting principles", "Change in accounting principles","INCOME STATEMENT");
        this.addQuestion(q99);
        com.example.valero.bookkeepingnciii.Question q100 = new com.example.valero.bookkeepingnciii.Question("The income statement format that segregates the operating revenues and expenses from the non-operating revenues and expenses is the ", "Single-step", "Multiple-step", "Triple-step", "Multiple-step","INCOME STATEMENT");
        this.addQuestion(q100);

//BANK RECONCILIATION
        com.example.valero.bookkeepingnciii.Question q101 = new com.example.valero.bookkeepingnciii.Question("Interest earned by the business for money invested in the bank. Usually earned through a cash management account or term deposits. This is shown in the bank statement in the credit column.", "Direct deposits", "Interest revenue", "Bank statement", "Interest revenue","BANK RECONCILIATION");
        this.addQuestion(q101);
        com.example.valero.bookkeepingnciii.Question q102 = new com.example.valero.bookkeepingnciii.Question("Circled amounts in the previous bank reconciliation statement are entered into this document at the end of the bank reconciliation process. ", "Bank statement ", "Current bank statement", "Current bank reconciliation statement", "Current bank reconciliation statement","BANK RECONCILIATION");
        this.addQuestion(q102);
        com.example.valero.bookkeepingnciii.Question q103 = new com.example.valero.bookkeepingnciii.Question("The previous bank reconciliation statement should be checked with this record at the beginning of the bank reconciliation process. ", "Bank statement", "Current statement", "current bank reconciliation statement", "Current bank statement","BANK RECONCILIATION");
        this.addQuestion(q103);
        com.example.valero.bookkeepingnciii.Question q104 = new com.example.valero.bookkeepingnciii.Question("The business can authorise the bank to accept deposits on its behalf. Only whent the bank statement is issued does the business receive confirmation of the increase in its deposits. Rent Revenue is commonly deposited directly into the business's bank account. ", "Direct deposits", "Interest revenue", "Bank statement", "Direct deposits","BANK RECONCILIATION");
        this.addQuestion(q104);
        com.example.valero.bookkeepingnciii.Question q105 = new com.example.valero.bookkeepingnciii.Question ("Document produced by the bank which shows the cash held by a business with the bank. It lists the deposits, withdrawals and balance of the business's bank account over a stated time period usually one month. ", "Direct deposits", "Interest revenue", "Bank statement", "Bank statement","BANK RECONCILIATION");
        this.addQuestion(q105);
        com.example.valero.bookkeepingnciii.Question q106 = new com.example.valero.bookkeepingnciii.Question("Which of the following items will require a journal entry to the company's books?", "Bank service charge", "Deposit in transit", "Bank error", "Bank service charge","BANK RECONCILIATION");
        this.addQuestion(q106);
        com.example.valero.bookkeepingnciii.Question q107 = new com.example.valero.bookkeepingnciii.Question("Which of the following will NOT require a journal entry to the company's books?", "Checking printing charge", "Outstanding checks", "Fee For NSF Check", "Outstanding checks","BANK RECONCILIATION");
        this.addQuestion(q107);
        com.example.valero.bookkeepingnciii.Question q108 = new com.example.valero.bookkeepingnciii.Question("A company recorded its check #2754 in its accounting records as $98. However, check #2754 was actually written for $89 and it cleared the bank as $89. What adjustment is needed to the Cash balance per books?", "Decrease By $9", "Increase By $9", "None Needed", "Increase By $9","BANK RECONCILIATION");
        this.addQuestion(q108);
        com.example.valero.bookkeepingnciii.Question q109 = new com.example.valero.bookkeepingnciii.Question("A company recorded its August 15 receipts on its books as $165. However, the receipts were actually $156. The deposit slip for the bank was prepared correctly as $156. What adjustment is needed to the Cash balance per books?", "Decrease By $9", "Increase By $9", "None Needed", "Decrease By $9","BANK RECONCILIATION");
        this.addQuestion(q109);
        com.example.valero.bookkeepingnciii.Question q110 = new com.example.valero.bookkeepingnciii.Question("A company deposited a check from a customer into its checking account. A few days later the check was returned with the notation account closed and the bank deducted the amount on the bank statement.", "Add", "Deduct", "Balance", "Deduct","BANK RECONCILIATION");
        this.addQuestion(q110);

//ACCOUNTS PAYABLE
        com.example.valero.bookkeepingnciii.Question q111 = new com.example.valero.bookkeepingnciii.Question("If a purchase is made from a supplier on credit, the account debited is? ", "Accounts payable", "Purchases", "Cash", "Purchases","ACCOUNTS PAYABLE");
        this.addQuestion(q111);
        com.example.valero.bookkeepingnciii.Question q112 = new com.example.valero.bookkeepingnciii.Question("Suppose an invoice is received for £2,000 2% 15 days, net 30 terms. What is the discount taken if paid in 14 days? ", "400 ", "40", "0", "40","ACCOUNTS PAYABLE");
        this.addQuestion(q112);
        com.example.valero.bookkeepingnciii.Question q113 = new com.example.valero.bookkeepingnciii.Question("What are trade accounts payable? ", "Amounts owed to cash suppliers", "Amounts owed to customers", "Amounts owed to trade credit suppliers", "Amounts owed to trade credit suppliers","ACCOUNTS PAYABLE");
        this.addQuestion(q113);
        com.example.valero.bookkeepingnciii.Question q114 = new com.example.valero.bookkeepingnciii.Question(" A discount of 2% for paying within 10 days instead of 30 days amounts to an annual percentage rate closest to", "2%", "24%", "36%", "36%","ACCOUNTS PAYABLE");
        this.addQuestion(q114);
        com.example.valero.bookkeepingnciii.Question q115 = new com.example.valero.bookkeepingnciii.Question ("Accounts payable is used in which ratio? ", "Current ratio", "Fixed assets turnover ratio", "Current asset", "Current ratio","ACCOUNTS PAYABLE");
        this.addQuestion(q115);
        com.example.valero.bookkeepingnciii.Question q116 = new com.example.valero.bookkeepingnciii.Question("The accounts payable subsidiary ledger should be reconciled to which account?", "Cash control", "Accounts payable control ", "Accounts receivable control", "Accounts payable control","ACCOUNTS PAYABLE");
        this.addQuestion(q116);
        com.example.valero.bookkeepingnciii.Question q117 = new com.example.valero.bookkeepingnciii.Question("When an auditor finds a debit to accounts payable, which of the following accounts is most likely to be credited? ", " Accounts Receivable.", "Accrued liabilities.", "Cash", "Cash","ACCOUNTS PAYABLE");
        this.addQuestion(q117);
        com.example.valero.bookkeepingnciii.Question q118 = new com.example.valero.bookkeepingnciii.Question("What reports are updated when you post the vouchers to the AP file?", "Open AP, Cash Requirement, Vedor History reports", "Voucher Edit, Open AP, Vendor Master File", "Vendor & PO register, Open AP, Vendor Edit report", "Open AP, Cash Requirement, Vedor History reports","ACCOUNTS PAYABLE");
        this.addQuestion(q118);
        com.example.valero.bookkeepingnciii.Question q119 = new com.example.valero.bookkeepingnciii.Question("Paying the insurance premium on December 20 for the six-month period beginning 12 days later should result in a debit balance in the asset account __________ Insurance.", "Unpaid", "Prepaid", "Cash", "Prepaid","ACCOUNTS PAYABLE");
        this.addQuestion(q119);
        com.example.valero.bookkeepingnciii.Question q120 = new com.example.valero.bookkeepingnciii.Question("The segregation or separation of duties and the safeguarding of checks are two examples of an important topic known as __________ controls.", "Internal", "External", "All of the above", "Internal","ACCOUNTS PAYABLE");
        this.addQuestion(q120);

//INVENTORY COST OF GOOD SOLD
        com.example.valero.bookkeepingnciii.Question q121 = new com.example.valero.bookkeepingnciii.Question("The inventory cost flow assumption where the cost of the most recent purchase is matched first against sales revenues is ", "FIFO", "LIFO", "Average", "LIFO","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q121);
        com.example.valero.bookkeepingnciii.Question q122 = new com.example.valero.bookkeepingnciii.Question("The inventory cost flow assumption where the oldest cost of inventory items is likely to remain on the balance sheet is ", "FIFO ", "LIFO", "Average", "LIFO","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q122);
        com.example.valero.bookkeepingnciii.Question q123 = new com.example.valero.bookkeepingnciii.Question("The account Inventory will appear on the balance sheet as a current asset at an amount that often reflects the __________ of the merchandise on hand. ", "Cost", "Sales value", "None of the above", "Cost","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q123);
        com.example.valero.bookkeepingnciii.Question q124 = new com.example.valero.bookkeepingnciii.Question("The inventory system that does NOT update the Inventory account automatically at the time of each purchase or sales is the _______________ method/system.", "Perpetual", "Periodic", "None of the above", "Perpetual","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q124);
        com.example.valero.bookkeepingnciii.Question q125 = new com.example.valero.bookkeepingnciii.Question ("A company purchased items for inventory during 2015 at continuously higher costs. Its last two purchases of 2015 were 20 units on December 20 at a cost of $14 per unit and 30 units on December 30 at a cost of $15 per unit. On December 28, 2015 the company made its last sale for the year when it sold 10 units. Which inventory cost flow assumption will cause the $15 cost per unit to be expensed as part of the year 2015's cost of goods sold? ", "LIFO Periodic", "LIFO Perpetual", "Neither", "LIFO Periodic","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q125);
        com.example.valero.bookkeepingnciii.Question q126 = new com.example.valero.bookkeepingnciii.Question("A company has properly recorded all of its purchases of merchandise inventory, but made an error when counting its ending inventory. As a result of the error the company's Inventory account is overstated by $24,000. (This means that the amount in the Inventory account is too high by $24,000.) What is the impact of this error on the company's income statement? Specifically, the company's reported profit (ignoring income tax expense) in the period of the error is...", "Too high", "Too low", "Not affected", "Too High","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q126);
        com.example.valero.bookkeepingnciii.Question q127 = new com.example.valero.bookkeepingnciii.Question("The inventory cost flow assumption where the cost of the most recent purchases are likely to remain in inventory", "FIFO", "LIFO", "Average", "FIFO","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q127);
        com.example.valero.bookkeepingnciii.Question q128 = new com.example.valero.bookkeepingnciii.Question("A company in the computer industry is experiencing continuously lower costs. Which cost flow assumption will result in less income tax expense for this company?", "FIFO", "LIFO", "Average", "FIFO","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q128);
        com.example.valero.bookkeepingnciii.Question q129 = new com.example.valero.bookkeepingnciii.Question("A retailer's inventory cost should include freight-in on the merchandise purchased with terms ______ shipping point?", "FOB", "FIFO", "LIFO", "FOB","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q129);
        com.example.valero.bookkeepingnciii.Question q130 = new com.example.valero.bookkeepingnciii.Question("Net Purchases is Gross Purchases minus Purchase Returns and Allowances and _____________.", "Purchase discount", "Sales discount", "Merchandise", "Purchase discount","INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q130);

//DEPRECIATION
        com.example.valero.bookkeepingnciii.Question q131 = new com.example.valero.bookkeepingnciii.Question("What type of assets are depreciated? ", "Plant", "Current", "None of the above", "Plant","DEPRECIATION");
        this.addQuestion(q131);
        com.example.valero.bookkeepingnciii.Question q132 = new com.example.valero.bookkeepingnciii.Question("Which of the following is a plant asset?", "Supplies ", "Track", "Merchandise inventory", "Truck","DEPRECIATION");
        this.addQuestion(q132);
        com.example.valero.bookkeepingnciii.Question q133 = new com.example.valero.bookkeepingnciii.Question("What type of account is accumulated depreciation? ", "Current asset", "Plant asset", "Contra plant asset", "Contra plant asset","DEPRECIATION");
        this.addQuestion(q133);
        com.example.valero.bookkeepingnciii.Question q134 = new com.example.valero.bookkeepingnciii.Question("What does the net pay control account represent?", "The gross wages and salaries expense", "An amount due to the employee for wages and salaries", "An amount due from the employee for tax owed", "An amount due to the employee for wages and salaries","DEPRECIATION");
        this.addQuestion(q134);
        com.example.valero.bookkeepingnciii.Question q135 = new com.example.valero.bookkeepingnciii.Question ("Is the gross pay account an income statement , balance sheet account or account receivable? ", "Income statement", "Balance sheet", "Account receivable", "Income statement","DEPRECIATION");
        this.addQuestion(q135);
        com.example.valero.bookkeepingnciii.Question q136 = new com.example.valero.bookkeepingnciii.Question("The book value of an asset is defined as", "Cost Minus Salvage Value", "Cost Minus Accumulated Depreciation. ", "Estimated Fair Market Value", "Cost Minus Accumulated Depreciation.","DEPRECIATION");
        this.addQuestion(q136);
        com.example.valero.bookkeepingnciii.Question q137 = new com.example.valero.bookkeepingnciii.Question("What are unpaid wages?", "Amounts earned by the employee but not paid at the end of the accounting period.", "An estimate of wages for the next accounting period.", "Amounts earned by the employee but not paid at the end of the accounting period.", "","DEPRECIATION");
        this.addQuestion(q137);
        com.example.valero.bookkeepingnciii.Question q138 = new com.example.valero.bookkeepingnciii.Question("What does the employee tax control account represent?", "A liability to the tax authority for tax deducted from employees gross pay.", "An amount due from the employee for tax owed.", "none of the above", "A liability to the tax authority for tax deducted from employees gross pay.","DEPRECIATION");
        this.addQuestion(q138);
        com.example.valero.bookkeepingnciii.Question q139 = new com.example.valero.bookkeepingnciii.Question("When the employer pays the employee in 2016 for the vacation earned in 2015, what account will the company debit?", "Cash", "Vacation Expense", "Vacation Payable", "Vacation Payable","DEPRECIATION");
        this.addQuestion(q139);
        com.example.valero.bookkeepingnciii.Question q140 = new com.example.valero.bookkeepingnciii.Question("Which of the following depreciation methods is NOT an accelerated method?", "Sum-of-the-years' Digits", "Straight-line", "Double-declining Balance", "Straight-line","DEPRECIATION");
        this.addQuestion(q140);

//PAYROLL ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q141 = new com.example.valero.bookkeepingnciii.Question("Unpaid wages are accrued for by a debit to which of the following accounts? ", "Accrual for wages", "Gross pay", "Net pay control", "Gross pay","PAYROLL ACCOUNTING");
        this.addQuestion(q141);
        com.example.valero.bookkeepingnciii.Question q142 = new com.example.valero.bookkeepingnciii.Question("The 2016 rate for the Social Security tax (excluding the Medicare tax) that is withheld from employees' salaries and wages up to a specified annual amount is __________%. ", "6.2 ", "6.4", "6.3", "6.2","PAYROLL ACCOUNTING");
        this.addQuestion(q142);
        com.example.valero.bookkeepingnciii.Question q143 = new com.example.valero.bookkeepingnciii.Question(" The combined rate for the Social Security tax and the Medicare tax to be withheld from each employee's gross wages up to $118,500 in 2016 is __________%.", "6.75%", "7.62%", "7.65% ", "7.65% (6.2% + 1.45%)","PAYROLL ACCOUNTING");
        this.addQuestion(q143);
        com.example.valero.bookkeepingnciii.Question q144 = new com.example.valero.bookkeepingnciii.Question("The pay earned by hourly-paid employees is usually referred to as __________.", "Wages", "Accounts payable", "Salaries", "Wages","PAYROLL ACCOUNTING");
        this.addQuestion(q144);
        com.example.valero.bookkeepingnciii.Question q145 = new com.example.valero.bookkeepingnciii.Question ("The pay earned by managers who are paid semi-monthly is referred to as __________.", "Wages", "Accounts payable", "Salary or salaries", "Salary or salaries","PAYROLL ACCOUNTING");
        this.addQuestion(q145);
        com.example.valero.bookkeepingnciii.Question q146 = new com.example.valero.bookkeepingnciii.Question("Which employee payroll classification will likely require an accrual adjusting entry for the gross salaries or wages at the end of a calendar month?", "Exempt Salaried Employees Paid Semi-monthly", "Hourly Employees Paid Weekly ", "All of the above", "Hourly Employees Paid Weekly","PAYROLL ACCOUNTING");
        this.addQuestion(q146);
        com.example.valero.bookkeepingnciii.Question q147 = new com.example.valero.bookkeepingnciii.Question("An employee is hired at a pay rate of $10 per hour. During the past week, the employee worked 50 hours. The employee’s gross wages for the past week are", "$400", "$550", "$450", "Right!\n" +
                "[40 hours X $10] plus [10 hours X $15] = $550\n" + "OR\n" + "[50 hours X $10] plus [10 hours X $5] = $550","PAYROLL ACCOUNTING");
        this.addQuestion(q147);
        com.example.valero.bookkeepingnciii.Question q148 = new com.example.valero.bookkeepingnciii.Question("The amount that an employee \"clears\" or \"takes home\" is the __________ pay.", "Cash on hand", "Net", "Account receivable", "Net","PAYROLL ACCOUNTING");
        this.addQuestion(q148);
        com.example.valero.bookkeepingnciii.Question q149 = new com.example.valero.bookkeepingnciii.Question("A tax paid by the employer that is 0.6% of each employee’s first $7,000 of annual salary or wages is __________ tax.", "Federal employment", "Employment", "None of the above", "Federal employment","PAYROLL ACCOUNTING");
        this.addQuestion(q149);
        com.example.valero.bookkeepingnciii.Question q150 = new com.example.valero.bookkeepingnciii.Question("The federal form on which an employee indicates the number of exemptions/dependents to be used in calculating the amount of federal income tax withholding for the employee is the __________ form.", "W-4", "W-5", "W-6", "W-4","PAYROLL ACCOUNTING");
        this.addQuestion(q150);

//STOCKHOLDER EQUITY
        com.example.valero.bookkeepingnciii.Question q151 = new com.example.valero.bookkeepingnciii.Question("One of the advantages of the corporation form of business as opposed to a partnership form is the ease of transferring __________. ", "Article in incorporation", "Ownership", "Stockholders equity", "Ownership","STOCKHOLDER EQUITY");
        this.addQuestion(q151);
        com.example.valero.bookkeepingnciii.Question q152 = new com.example.valero.bookkeepingnciii.Question("At a corporation, Assets minus Liabilities is __________. ", "Stockholders equity ", "Equity", "Owners", "Stockholders equity","STOCKHOLDER EQUITY");
        this.addQuestion(q152);
        com.example.valero.bookkeepingnciii.Question q153 = new com.example.valero.bookkeepingnciii.Question("The type of stock that gets its dividend before the common stock gets its dividend is called __________ stock. ", "Common", "Preferred", "Outstanding", "Preferred)","STOCKHOLDER EQUITY");
        this.addQuestion(q153);
        com.example.valero.bookkeepingnciii.Question q154 = new com.example.valero.bookkeepingnciii.Question("If a corporation has issued only one type of stock, it is __________ stock.", "Common", "Preferred", "Outstanding", "Outstanding","STOCKHOLDER EQUITY");
        this.addQuestion(q154);
        com.example.valero.bookkeepingnciii.Question q155 = new com.example.valero.bookkeepingnciii.Question ("Shares of stock that have been issued and have not been reacquired by the issuing corporation are called __________ shares.", "Common", "Preferred", "Outstanding", "Common","STOCKHOLDER EQUITY");
        this.addQuestion(q155);
        com.example.valero.bookkeepingnciii.Question q156 = new com.example.valero.bookkeepingnciii.Question("If a common stock does not have a par value or a stated value, the entire proceeds from issuing the stock is credited to one account entitled _______.", "Cumulative", "Treasury stock ", "Common stock", "Common stock","STOCKHOLDER EQUITY");
        this.addQuestion(q156);
        com.example.valero.bookkeepingnciii.Question q157 = new com.example.valero.bookkeepingnciii.Question("The par value of _______ stock usually has no economic significance.", "Common", "Debit", "Record", "Common","STOCKHOLDER EQUITY");
        this.addQuestion(q157);
        com.example.valero.bookkeepingnciii.Question q158 = new com.example.valero.bookkeepingnciii.Question("If a corporation declares a small stock dividend, the account that will be reduced by a debit entry is _______.", "Convertible", "Outstanding", "Retained earnings", "Retained earnings","STOCKHOLDER EQUITY");
        this.addQuestion(q158);
        com.example.valero.bookkeepingnciii.Question q159 = new com.example.valero.bookkeepingnciii.Question("If a share of treasury stock is sold for more than its cost, the difference is credited to _______.", "Paid-in capital and retained earnings", "Treasury stock", "Paid-in capital from treasury stock", "Paid-in capital from treasury stock","STOCKHOLDER EQUITY");
        this.addQuestion(q159);
        com.example.valero.bookkeepingnciii.Question q160 = new com.example.valero.bookkeepingnciii.Question(" Dividends in arrears occur only on _______ preferred stock.", "Convertible", "Declaration", "Board of directors", "Convertible","STOCKHOLDER EQUITY");
        this.addQuestion(q160);

//NONPROFIT ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q161 = new com.example.valero.bookkeepingnciii.Question("A nonprofit's revenues and expenses are reported on its statement of __________. ", "Cash flows", "Activities", "Financial position", "Activities","NONPROFIT ACCOUNTING");
        this.addQuestion(q161);
        com.example.valero.bookkeepingnciii.Question q162 = new com.example.valero.bookkeepingnciii.Question("A nonprofit's assets and liabilities are reported on its statement of __________. ", "Cash flows ", "Activities", "Financial position", "Financial position","NONPROFIT ACCOUNTING");
        this.addQuestion(q162);
        com.example.valero.bookkeepingnciii.Question q163 = new com.example.valero.bookkeepingnciii.Question("The classifications for reporting contributions according to the donors' stipulations are unrestricted, __________ restricted, and permanently restricted. ", "Temporarily", "Partially", "Permanently", "Temporarily","NONPROFIT ACCOUNTING");
        this.addQuestion(q163);
        com.example.valero.bookkeepingnciii.Question q164 = new com.example.valero.bookkeepingnciii.Question("Classifying expenses into program activities and supporting activities is known as the _______________ basis.", "Functional", "Natural", "None of the above", "Functional","NONPROFIT ACCOUNTING");
        this.addQuestion(q164);
        com.example.valero.bookkeepingnciii.Question q165 = new com.example.valero.bookkeepingnciii.Question ("Reporting expenses by categories such as salaries, rent, utilities, etc. is known as the _______________ basis.", "Functional", "Natural", "None of the above", "Natural","NONPROFIT ACCOUNTING");
        this.addQuestion(q165);
        com.example.valero.bookkeepingnciii.Question q166 = new com.example.valero.bookkeepingnciii.Question("The two types of restrictions on contributions that are classified as temporarily restricted are purpose and __________.", "Period of time", "Point in time ", "Time", "Time","NONPROFIT ACCOUNTING");
        this.addQuestion(q166);
        com.example.valero.bookkeepingnciii.Question q167 = new com.example.valero.bookkeepingnciii.Question("A nonprofit's expenses are reported as part of the changes in ___________________ net assets.", "Unrestricted", "Temporary restricted", "Permanently restricted", "Unrestricted","NONPROFIT ACCOUNTING");
        this.addQuestion(q167);
        com.example.valero.bookkeepingnciii.Question q168 = new com.example.valero.bookkeepingnciii.Question("Normally the principal portion of an endowment will be classified as _________________ net assets.", "Unrestricted", "Temporary restricted", "Permanently restricted", "Permanently restricted","NONPROFIT ACCOUNTING");
        this.addQuestion(q168);
        com.example.valero.bookkeepingnciii.Question q169 = new com.example.valero.bookkeepingnciii.Question("A nonprofit organization's assets that have been designated by its board of directors for a specific project should be reported on the external financial statements as__________________ net assets.", "Unrestricted", "Permanently restricted", "Temporary restricted", "Unrestricted","NONPROFIT ACCOUNTING");
        this.addQuestion(q169);
        com.example.valero.bookkeepingnciii.Question q170 = new com.example.valero.bookkeepingnciii.Question("Which form of financing is allowed for a nonprofit organization?", "Debt", "Sale Of Equity Securities", "Both Are Allowed", "Debt","NONPROFIT ACCOUNTING");
        this.addQuestion(q170);






        //
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTHARD);
        // Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(com.example.valero.bookkeepingnciii.Question quest) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUESHARD, quest.getQUESTION());
        values.put(KEY_ANSWERHARD, quest.getANSWER());
        values.put(KEY_OPTAHARD, quest.getOPTA());
        values.put(KEY_OPTBHARD, quest.getOPTB());
        values.put(KEY_OPTCHARD, quest.getOPTC());
        values.put(KEY_CATEGORYHARD, quest.getCATEGORY());
        // Inserting Row
        dbase.insert(TABLE_QUESTHARD, null, values);
    }

    public List<Question> getAllQuestions() {
        List<com.example.valero.bookkeepingnciii.Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTHARD;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                com.example.valero.bookkeepingnciii.Question quest = new com.example.valero.bookkeepingnciii.Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setCATEGORY(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }


    public List<Question> getQuestionsByCategory(String identifier) {
        List<com.example.valero.bookkeepingnciii.Question> quesList = new ArrayList<com.example.valero.bookkeepingnciii.Question>();
        String filterQuery = "SELECT * FROM questhard WHERE categoryHard LIKE '" + identifier + "'";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(filterQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                com.example.valero.bookkeepingnciii.Question quest = new com.example.valero.bookkeepingnciii.Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setCATEGORY(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }

        return quesList;
    }

}
