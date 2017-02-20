package com.example.valero.bookkeepingnciii;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class QuizHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 4;
    // Database Name
    private static final String DATABASE_NAME = "Quiz";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    private static final String TABLE_USER = "users";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private static final String KEY_CATEGORY = "category";

    public static final String ACCNT_BASIC = "ACCOUNTING BASIC";
    private SQLiteDatabase dbase;

    public QuizHelper(Context context) {
        super(context, Firstmenu.MAIN_DIR
                + File.separator + DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase.openOrCreateDatabase(Firstmenu.MAIN_DIR
                + File.separator + DATABASE_NAME, null);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_CATEGORY + " TEXT)";
        db.execSQL(sql);
        addQuestion();


    }

    private void addQuestion() {
//ACCOUNTING BASIC
        com.example.valero.bookkeepingnciii.Question q1 = new com.example.valero.bookkeepingnciii.Question("The financial statement that reports the revenues and expenses for a period of time such as a year or a month is the ?", "Balance Sheet", "Income Statement", "Statement of cash flow", "Income Statement", ACCNT_BASIC);
        this.addQuestion(q1);
        com.example.valero.bookkeepingnciii.Question q2 = new com.example.valero.bookkeepingnciii.Question("Under the accrual basis of accounting, revenues are reported in the accounting period when the   ?", "Cash is Received", "Service or Goods have been Delivered", "Income is received", "Service or Goods have been Delivered", ACCNT_BASIC);
        this.addQuestion(q2);
        com.example.valero.bookkeepingnciii.Question q3 = new com.example.valero.bookkeepingnciii.Question("Resources owned by a company (such as cash, accounts receivable, vehicles) are reported on the balance sheet and are referred to as \n" +
                "__________. \n ?", "Asset", "Liabilities", "Owners Equity", "Asset", ACCNT_BASIC);
        this.addQuestion(q3);
        com.example.valero.bookkeepingnciii.Question q4 = new com.example.valero.bookkeepingnciii.Question("Obligations (amounts owed) are reported on the balance sheet and are referred to as ________? ", "Asset", "Liabilities", "Capital", "Liabilities", ACCNT_BASIC);
        this.addQuestion(q4);
        com.example.valero.bookkeepingnciii.Question q5 = new com.example.valero.bookkeepingnciii.Question("Unearned Revenues is what type of account ? ", "Asset", "Liability", "Stockholders(Owners)Equity", "Liability", ACCNT_BASIC);
        this.addQuestion(q5);
        com.example.valero.bookkeepingnciii.Question q6 = new com.example.valero.bookkeepingnciii.Question("The listing of all of the accounts available for use in a company's accounting system is known as the__________ ? ", "Account title", "Chart of Account", "Account Receivable", " Chart of Account", ACCNT_BASIC);
        this.addQuestion(q6);
        com.example.valero.bookkeepingnciii.Question q7 = new com.example.valero.bookkeepingnciii.Question("Which term is associated with \"left\" or \"left-side\" ?", "Debit", "Credit", "Asset", " Debit", ACCNT_BASIC);
        this.addQuestion(q7);
        com.example.valero.bookkeepingnciii.Question q8 = new com.example.valero.bookkeepingnciii.Question("Which term is associated with \"right\" or \"right-side\" ?", "Credit", "Liability", "Debit", "Credit", ACCNT_BASIC);
        this.addQuestion(q8);
        com.example.valero.bookkeepingnciii.Question q9 = new com.example.valero.bookkeepingnciii.Question("Revenues minus expenses equals __________ ?", "Net income", "Net Expense", "Net Capital", " Net income", ACCNT_BASIC);
        this.addQuestion(q9);
        com.example.valero.bookkeepingnciii.Question q10 = new com.example.valero.bookkeepingnciii.Question("The Asset statement that reports the assets, liabilities, and stockholders' (owner's) equity at a specific date is the ?", "Balance Sheet", "Income Statement", "Statement of cash flow", "Balance Sheet", ACCNT_BASIC);
        this.addQuestion(q10);
//DEBITS AND CREDITS
        com.example.valero.bookkeepingnciii.Question q11 = new com.example.valero.bookkeepingnciii.Question("Use the following information for questions 1 and 2:\n" +
                "A company receives $500 of cash as an additional investment in the company by its owner, Mary Smith. The company's Cash account is increased and Mary Smith, Capital is increased.\n" +
                "Should the $500 entry to the Cash account be a debit? ", "Yes", "No", "Maybe", "Yes", "DEBITS AND CREDITS");
        this.addQuestion(q11);
        com.example.valero.bookkeepingnciii.Question q12 = new com.example.valero.bookkeepingnciii.Question("Use the following information for questions 1 and 2:\n" +
                "A company receives $500 of cash as an additional investment in the company by its owner, Mary Smith. The company's Cash account is increased and Mary Smith, Capital is increased.\n" +
                "Should the $500 entry to Mary Smith, Capital be a debit?", "Yes ", "No", "Maybe ", "No", "DEBITS AND CREDITS");
        this.addQuestion(q12);
        com.example.valero.bookkeepingnciii.Question q13 = new com.example.valero.bookkeepingnciii.Question("Generally when an expense is involved in a transaction, an expense will be", "Debited", "Credited", "None of the above", "Debited", "DEBITS AND CREDITS");
        this.addQuestion(q13);
        com.example.valero.bookkeepingnciii.Question q14 = new com.example.valero.bookkeepingnciii.Question("Generally when revenues are involved in a transaction, a revenue account will be", "Debited", "Credited", "None of the above", "Credited", "DEBITS AND CREDITS");
        this.addQuestion(q14);
        com.example.valero.bookkeepingnciii.Question q15 = new com.example.valero.bookkeepingnciii.Question("The accountant's word to indicate that an entry will be recorded on the left-side of an account is ", "Debit", "Credit", "None of the above", "Debit", "DEBITS AND CREDITS");
        this.addQuestion(q15);
        com.example.valero.bookkeepingnciii.Question q16 = new com.example.valero.bookkeepingnciii.Question("A contra-liability account such as Discount on Notes Payable will likely have which balance?", "Debit", "Credit", "None of the above", "Debit", "DEBITS AND CREDITS");
        this.addQuestion(q16);
        com.example.valero.bookkeepingnciii.Question q17 = new com.example.valero.bookkeepingnciii.Question("A contra-asset account such as Accumulated Depreciation will likely have which balance?", "Debit", "Credit", "None of the above ", " Credit", "DEBITS AND CREDITS");
        this.addQuestion(q17);
        com.example.valero.bookkeepingnciii.Question q18 = new com.example.valero.bookkeepingnciii.Question("Michel Auditor drawing account increase by P800.", "Debited", "Credited", "None of the above", "Debited", "DEBITS AND CREDITS");
        this.addQuestion(q18);
        com.example.valero.bookkeepingnciii.Question q19 = new com.example.valero.bookkeepingnciii.Question("Prepaid insurance account decrease", "Debited", "Credited", "None of the above", "Credited", "DEBITS AND CREDITS");
        this.addQuestion(q19);
        com.example.valero.bookkeepingnciii.Question q20 = new com.example.valero.bookkeepingnciii.Question("Cash in bank account decrease by P8450", "Debited", "Credited", "None of the above", "Credited", "DEBITS AND CREDITS");
        this.addQuestion(q20);
//CHART OF ACCOUNT
        com.example.valero.bookkeepingnciii.Question q21 = new com.example.valero.bookkeepingnciii.Question("The chart of accounts is a listing of the accounts presently having balances in the general ledger.", "True", "False", "Maybe", "False", "CHART OF ACCOUNT");
        this.addQuestion(q21);
        com.example.valero.bookkeepingnciii.Question q22 = new com.example.valero.bookkeepingnciii.Question("Some accounting software will classify some accounts as \"income\" accounts, while accountants might refer to these accounts as \"revenue\" accounts.", "True ", "False", "Maybe ", "True", "CHART OF ACCOUNT");
        this.addQuestion(q22);
        com.example.valero.bookkeepingnciii.Question q23 = new com.example.valero.bookkeepingnciii.Question("The digits of the account numbers assigned to general ledger accounts often have significance. For example, an account number beginning with a \"1\" might signify that the account is an asset account, a \"6\" might signify an operating expense, etc.", "True", "False", "Maybe", "True,", "CHART OF ACCOUNT");
        this.addQuestion(q23);
        com.example.valero.bookkeepingnciii.Question q24 = new com.example.valero.bookkeepingnciii.Question("Generally when revenues are involved in a transaction, a revenue account will be", "Debited", "Credited", "None of the above", "Credited", "CHART OF ACCOUNT");
        this.addQuestion(q24);
        com.example.valero.bookkeepingnciii.Question q25 = new com.example.valero.bookkeepingnciii.Question("The accountant's word to indicate that an entry will be recorded on the left-side of an account is ", "Debit", "Credit", "None of the above", "Debit", "CHART OF ACCOUNT");
        this.addQuestion(q25);
        com.example.valero.bookkeepingnciii.Question q26 = new com.example.valero.bookkeepingnciii.Question("A contra-liability account such as Discount on Notes Payable will likely have which balance?", "Debit", "Credit", "None of the above", "Debit", "CHART OF ACCOUNT");
        this.addQuestion(q26);
        com.example.valero.bookkeepingnciii.Question q27 = new com.example.valero.bookkeepingnciii.Question("A contra-asset account such as Accumulated Depreciation will likely have which balance?", "Debit", "Credit", "None of the above ", "Credit", "CHART OF ACCOUNT");
        this.addQuestion(q27);
        com.example.valero.bookkeepingnciii.Question q28 = new com.example.valero.bookkeepingnciii.Question("Michel Auditor drawing account increase by P800.", "Debited", "Credited", "None of the above", "Debited", "CHART OF ACCOUNT");
        this.addQuestion(q28);
        com.example.valero.bookkeepingnciii.Question q29 = new com.example.valero.bookkeepingnciii.Question("Prepaid insurance account decrease", "Debited", "Credited", "None of the above", "Credited", "CHART OF ACCOUNT");
        this.addQuestion(q29);
        com.example.valero.bookkeepingnciii.Question q30 = new com.example.valero.bookkeepingnciii.Question("Cash in bank account decrease by P8450", "Debited", "Credited", "None of the above", "Credited", "CHART OF ACCOUNT");
        this.addQuestion(q30);


//BOOKKEEPING
        com.example.valero.bookkeepingnciii.Question q31 = new com.example.valero.bookkeepingnciii.Question("The two main methods of bookkeeping and accounting are 1) the cash method, and 2) the __________method.", "Depreciation", "Accruals", "Accumulated Depreciation", "Accruals", "BOOKKEEPING");
        this.addQuestion(q31);
        com.example.valero.bookkeepingnciii.Question q32 = new com.example.valero.bookkeepingnciii.Question("__________-entry bookkeeping means that every transaction will affect two or more accounts.", "Triple ", "Single", "Double", "Double", "BOOKKEEPING");
        this.addQuestion(q32);
        com.example.valero.bookkeepingnciii.Question q33 = new com.example.valero.bookkeepingnciii.Question("A __________ amount will appear on the left side of a T-account.", "Debit", "Credit", "Trial balance", "Debit", "BOOKKEEPING");
        this.addQuestion(q33);
        com.example.valero.bookkeepingnciii.Question q34 = new com.example.valero.bookkeepingnciii.Question("When a check is written, a cash account should be __________.", "Debited", "Credited", "Equal", "Credited,", "BOOKKEEPING");
        this.addQuestion(q34);
        com.example.valero.bookkeepingnciii.Question q35 = new com.example.valero.bookkeepingnciii.Question("Liability accounts will normally have __________ balances. ", "Equal", "Credit", "Debit", "Credit", "BOOKKEEPING");
        this.addQuestion(q35);
        com.example.valero.bookkeepingnciii.Question q36 = new com.example.valero.bookkeepingnciii.Question("Revenue accounts will normally have __________ balances.", "Debit", "Equal", "Credit", "Credit", "BOOKKEEPING");
        this.addQuestion(q36);
        com.example.valero.bookkeepingnciii.Question q37 = new com.example.valero.bookkeepingnciii.Question("Accrued expenses are likely to pertain to transactions that have ALREADY been paid.", "True", "Maybe", "False", "False", "BOOKKEEPING");
        this.addQuestion(q37);
        com.example.valero.bookkeepingnciii.Question q38 = new com.example.valero.bookkeepingnciii.Question("Deferred revenues likely involve cash amounts that have NOT YET been received.", "Maybe", "False", "True", "False", "BOOKKEEPING");
        this.addQuestion(q38);
        com.example.valero.bookkeepingnciii.Question q39 = new com.example.valero.bookkeepingnciii.Question("A supplier of goods or services is known as a VENDOR.", "Maybe", "False", "True", "True", "BOOKKEEPING");
        this.addQuestion(q39);
        com.example.valero.bookkeepingnciii.Question q40 = new com.example.valero.bookkeepingnciii.Question("The book of original entry is the definition of a LEDGER.", "True", "False ", "Maybe", "False", "BOOKKEEPING");
        this.addQuestion(q40);

//ACCOUNTING EQUATION
        com.example.valero.bookkeepingnciii.Question q41 = new com.example.valero.bookkeepingnciii.Question("The basic accounting equation is Assets = Liabilities + (Owner’s equity or Stockholder’s equity (if  a corporation)  Net asset (if noneprofit organization ))", "True", "False", "Maybe", "True", "ACCOUNTING EQUATION");
        this.addQuestion(q41);
        com.example.valero.bookkeepingnciii.Question q42 = new com.example.valero.bookkeepingnciii.Question("The accounting equation should remain in balance because every transaction affects how many accounts?", "Only one ", "Only two", "Two or more ", "Two or more", "ACCOUNTING EQUATION");
        this.addQuestion(q42);
        com.example.valero.bookkeepingnciii.Question q43 = new com.example.valero.bookkeepingnciii.Question("A corporation's net income is eventually recorded in the following stockholders' equity account:RETAINED EARNINGS", "True", "False", "Maybe", "True", "ACCOUNTING EQUATION");
        this.addQuestion(q43);
        com.example.valero.bookkeepingnciii.Question q44 = new com.example.valero.bookkeepingnciii.Question("The financial statement that reports the portion of change in owner's equity resulting from revenues and expenses during a specified time interval is the FINANCIAL STATEMENT", "False", "True", "Maybe", "False(Income Statement)", "ACCOUNTING EQUATION");
        this.addQuestion(q44);
        com.example.valero.bookkeepingnciii.Question q45 = new com.example.valero.bookkeepingnciii.Question("The financial statement with a structure that is similar to the accounting equation is the BALANCE SHEET", "Maybe", "True", "False", "True", "ACCOUNTING EQUATION");
        this.addQuestion(q45);
        com.example.valero.bookkeepingnciii.Question q46 = new com.example.valero.bookkeepingnciii.Question("A corporation's quarterly DIVIDENDS will cause a reduction in the corporation's retained earnings, which in turn reduces the corporation's stockholders' equity. However, this will not reduce the corporation's net income. ", "True", "False", "Maybe", "True", "ACCOUNTING EQUATION");
        this.addQuestion(q46);
        com.example.valero.bookkeepingnciii.Question q47 = new com.example.valero.bookkeepingnciii.Question("Which of the following will cause owner's equity to increase?", "Expenses", "Owners Draws", "Revenue ", "Revenue", "ACCOUNTING EQUATION");
        this.addQuestion(q47);
        com.example.valero.bookkeepingnciii.Question q48 = new com.example.valero.bookkeepingnciii.Question("Which of the following will cause owner's equity to decrease?", "Net income", "Net loss", "Revenue", "Net loss", "ACCOUNTING EQUATION");
        this.addQuestion(q48);
        com.example.valero.bookkeepingnciii.Question q49 = new com.example.valero.bookkeepingnciii.Question("Prepaid insurance account decrease", "Debited", "Credited", "None of the above", "Credited", "ACCOUNTING EQUATION");
        this.addQuestion(q49);
        com.example.valero.bookkeepingnciii.Question q50 = new com.example.valero.bookkeepingnciii.Question("Cash in bank account decrease by P8450", "Debited", "Credited", "None of the above", "Credited", "ACCOUNTING EQUATION");
        this.addQuestion(q50);

//ACCOUNTING PRINCIPLES
        com.example.valero.bookkeepingnciii.Question q51 = new com.example.valero.bookkeepingnciii.Question("The personal assets of the owner of a company will not appear on the company's balance sheet because of which principle/guideline?", "Cost", "Economic Entity", "Monetary Unit", "Economic Entity", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q51);
        com.example.valero.bookkeepingnciii.Question q52 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline requires a company's balance sheet to report its land at the amount the company paid to acquire the land, even if the land could be sold today at a significantly higher amount?", "Cost ", "Economic Entity", "Monetary Unit ", "Cost", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q52);
        com.example.valero.bookkeepingnciii.Question q53 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline allows a company to ignore the change in the purchasing power of the dollar over time?", "Cost", "Economic Entity", "Monetary Unit", "Monetary Unit", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q53);
        com.example.valero.bookkeepingnciii.Question q54 = new com.example.valero.bookkeepingnciii.Question("A retailer wishes to report its merchandise inventory on its balance sheet at its retail value. This would violate which accounting principle/guideline?", "Cost", "Full Disclosure", "Monetary Unit", "Cost", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q54);
        com.example.valero.bookkeepingnciii.Question q55 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline directs a company to show all the expenses related to its revenues of a specified period even if the expenses were not paid in that period?", "Cost", "Matching", "Monetary Unit", "Matching", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q55);
        com.example.valero.bookkeepingnciii.Question q56 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline is associated with the assumption that the company will continue on long enough to carry out its objectives and commitments?", "Economic Entity ", "Going Concern ", "Time Period", "Going concern", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q56);
        com.example.valero.bookkeepingnciii.Question q57 = new com.example.valero.bookkeepingnciii.Question("Accrual accounting is based on this principle/guideline.", "Cost", "Full Disclosure", "Matching", "Matching", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q57);
        com.example.valero.bookkeepingnciii.Question q58 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline justifies a company violating an accounting principle because the amounts are immaterial?", "Materiality", "Economic Entity", "Full Disclosure", "Materiality", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q58);
        com.example.valero.bookkeepingnciii.Question q59 = new com.example.valero.bookkeepingnciii.Question("Which principle/guideline requires the company's financial statements to have footnotes containing information that is important to users of the financial statements?", "Conservatism", "Economic Entity", "Full Disclosure", "Full Disclosure", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q59);
        com.example.valero.bookkeepingnciii.Question q60 = new com.example.valero.bookkeepingnciii.Question("Accountants might recognize losses but not gains in certain situations. For example, the company might write-down the cost of inventory, but will not write-up the cost of inventory. Which principle/guideline is associated with this action?", "Conservatism", "Materiality", "Monetary Unit", "Conservatism", "ACCOUNTING PRINCIPLES");
        this.addQuestion(q60);

//FINANCIAL ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q61 = new com.example.valero.bookkeepingnciii.Question("The first section of the statement of cash flows is the OPERATING activities. ", "True", "Maybe", "False", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q61);
        com.example.valero.bookkeepingnciii.Question q62 = new com.example.valero.bookkeepingnciii.Question("The statement of cash flows explains the changes in cash and cash ON HAND during the specified time interval. ", "Maybe ", "False", "True ", "False(Equivalents)", "FINANCIAL ACCOUNTING");
        this.addQuestion(q62);
        com.example.valero.bookkeepingnciii.Question q63 = new com.example.valero.bookkeepingnciii.Question("The word ACCOUNTS is often in the title of liability accounts. ", "False", "Maybe", "False", "False (Payable)", "FINANCIAL ACCOUNTING");
        this.addQuestion(q63);
        com.example.valero.bookkeepingnciii.Question q64 = new com.example.valero.bookkeepingnciii.Question("Prepaid insurance is reported as an ASSET on a company's balance sheet. (", "False", "True", "Maybe", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q64);
        com.example.valero.bookkeepingnciii.Question q65 = new com.example.valero.bookkeepingnciii.Question("he main components or elements of the income statement are REVENUES,expenses, gains, and losses. ", "False", "Maybe", "True", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q65);
        com.example.valero.bookkeepingnciii.Question q66 = new com.example.valero.bookkeepingnciii.Question("The profitability of a company for a specified period of time is reported on the INCOME statement. ", "False", "True ", "Maybe", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q66);
        com.example.valero.bookkeepingnciii.Question q67 = new com.example.valero.bookkeepingnciii.Question("Matching, cost, and full disclosure are examples of the fundamental or basic accounting PRINCIPLES.. ", "False", "Maybe", "True", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q67);
        com.example.valero.bookkeepingnciii.Question q68 = new com.example.valero.bookkeepingnciii.Question("The accounting equation is Assets = LIABILITIES + Stockholders' (or Owner's) Equity", "True", "Maybe", "False", "True", "FINANCIAL ACCOUNTING");
        this.addQuestion(q68);
        com.example.valero.bookkeepingnciii.Question q69 = new com.example.valero.bookkeepingnciii.Question("Every transaction will have one account being credited and one account being CREDITED ", "True", "False", "Maybe", "False", "FINANCIAL ACCOUNTING");
        this.addQuestion(q69);
        com.example.valero.bookkeepingnciii.Question q70 = new com.example.valero.bookkeepingnciii.Question("SINGLE entry bookkeeping will result in at least two accounts being involved in every transaction. ", "False", "True", "Maybe", "False", "FINANCIAL ACCOUNTING");
        this.addQuestion(q70);

//ADJUSTING ENTRIES
        com.example.valero.bookkeepingnciii.Question q71 = new com.example.valero.bookkeepingnciii.Question("Accounts that are partly income statement accounts and balance sheet accounts are called dual accounts. ", "True", "Maybe", "False", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q71);
        com.example.valero.bookkeepingnciii.Question q72 = new com.example.valero.bookkeepingnciii.Question("GROOSS PROFIT is equal to Net sales minus cost of goods sold. ", "Maybe ", "False", "True ", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q72);
        com.example.valero.bookkeepingnciii.Question q73 = new com.example.valero.bookkeepingnciii.Question("When revenues and expenses are equal for the same accounting period, it is called the matching principle and there is neither a loss or a profit. ", "False", "Maybe", "False", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q73);
        com.example.valero.bookkeepingnciii.Question q74 = new com.example.valero.bookkeepingnciii.Question("When revenues and expenses are equal for the same accounting period, it is called the matching principle and there is neither a loss or a profit.", "False", "True", "Maybe", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q74);
        com.example.valero.bookkeepingnciii.Question q75 = new com.example.valero.bookkeepingnciii.Question("Under the perpetual inventory system, the ending inventory is determined by a physical count and is recorded in the Merchandise Inventory Account.", "False", "Maybe", "True", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q75);
        com.example.valero.bookkeepingnciii.Question q76 = new com.example.valero.bookkeepingnciii.Question("Purchaser's description of a cash discount received from a supplier of goods.  ", "Cash discount", "Sales discount ", "Purchase discount", "Purchase discount", "ADJUSTING ENTRIES");
        this.addQuestion(q76);
        com.example.valero.bookkeepingnciii.Question q77 = new com.example.valero.bookkeepingnciii.Question("In general, the accounts in the income statement are ", "Permanent account", "Temporary account", "Unearned revenues account", "Temporary account", "ADJUSTING ENTRIES");
        this.addQuestion(q77);
        com.example.valero.bookkeepingnciii.Question q78 = new com.example.valero.bookkeepingnciii.Question("Which of the following is/are a purpose of adjusting entries?", "To updates the account in the books", "To apply the matching principles", "All of the above", "All of the above", "ADJUSTING ENTRIES");
        this.addQuestion(q78);
        com.example.valero.bookkeepingnciii.Question q79 = new com.example.valero.bookkeepingnciii.Question("Accounts that are partly income statement accounts and balance sheet accounts are called dual accounts", "True", "False", "Maybe", "False", "ADJUSTING ENTRIES");
        this.addQuestion(q79);
        com.example.valero.bookkeepingnciii.Question q80 = new com.example.valero.bookkeepingnciii.Question("Under the perpetual inventory system, the ending inventory is determined by a physical count and is recorded in the Merchandise Inventory Account. ", "False", "True", "Maybe", "False", "ADJUSTING ENTRIES,");
        this.addQuestion(q80);

        //BALANCE SHEET
        com.example.valero.bookkeepingnciii.Question q81 = new com.example.valero.bookkeepingnciii.Question("Another name for the balance sheet is ", "Statements of operation", "Statement of financial position", "Statement of financial income", "Statement of financial position", "BALANCE SHEET");
        this.addQuestion(q81);
        com.example.valero.bookkeepingnciii.Question q82 = new com.example.valero.bookkeepingnciii.Question("The book value of a corporation is the total amount of stockholders' equity reported on the balance sheet. ", "Maybe ", "False", "True ", "True", "BALANCE SHEET");
        this.addQuestion(q82);
        com.example.valero.bookkeepingnciii.Question q83 = new com.example.valero.bookkeepingnciii.Question("The third line of the balance sheet at the end of the year should begin with \"For the Year Ended\". ", "True", "Maybe", "False", "False", "BALANCE SHEET");
        this.addQuestion(q83);
        com.example.valero.bookkeepingnciii.Question q84 = new com.example.valero.bookkeepingnciii.Question("The amount reported on the balance sheet for Property, Plant and Equipment is the company's estimate of the fair market value as of the balance sheet date.", "False", "True", "Maybe", "False", "BALANCE SHEET");
        this.addQuestion(q84);
        com.example.valero.bookkeepingnciii.Question q85 = new com.example.valero.bookkeepingnciii.Question("The total amount reported for stockholders' equity is the approximate fair value or net worth of the corporation as of the balance sheet date. ", "True", "Maybe", "False", "False", "BALANCE SHEET");
        this.addQuestion(q85);
        com.example.valero.bookkeepingnciii.Question q86 = new com.example.valero.bookkeepingnciii.Question("The balance sheet heading will specify a  ", "Period of time", "Point in time ", "Service in time", "Point in time", "BALANCE SHEET");
        this.addQuestion(q86);
        com.example.valero.bookkeepingnciii.Question q87 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for an asset account? ", "Credit", "Debit", "Balance sheet", "Debit", "BALANCE SHEET");
        this.addQuestion(q87);
        com.example.valero.bookkeepingnciii.Question q88 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for liability accounts?", "Debit", "Debit and Credit", "Credit", "Credit", "BALANCE SHEET");
        this.addQuestion(q88);
        com.example.valero.bookkeepingnciii.Question q89 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for contra asset accounts?", "Credit", "Balance sheet", "Debit", "Credit", "BALANCE SHEET");
        this.addQuestion(q89);
        com.example.valero.bookkeepingnciii.Question q90 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for stockholders' equity and owner's equity accounts? ", "Both Debit and Credit", "Debit", "Credit", "Credit", "BALANCE SHEET");
        this.addQuestion(q90);
//INCOME STATEMENT
        com.example.valero.bookkeepingnciii.Question q91 = new com.example.valero.bookkeepingnciii.Question("If a company's stock is publicly traded, is it a requirement that the earnings per share appear on the income statement? ", "Yes", "No", "", "Yes", "INCOME STATEMENT");
        this.addQuestion(q91);
        com.example.valero.bookkeepingnciii.Question q92 = new com.example.valero.bookkeepingnciii.Question("Are the notes to the financial statements considered to be an integral part of the financial statements? ", "Yes ", "No", "", "Yes", "INCOME STATEMENT");
        this.addQuestion(q92);
        com.example.valero.bookkeepingnciii.Question q93 = new com.example.valero.bookkeepingnciii.Question(" ", "False", "Maybe", "False", "False", "INCOME STATEMENT");
        this.addQuestion(q93);
        com.example.valero.bookkeepingnciii.Question q94 = new com.example.valero.bookkeepingnciii.Question("The amount reported on the balance sheet for Property, Plant and Equipment is the company's estimate of the fair market value as of the balance sheet date.", "False", "True", "Maybe", "False", "INCOME STATEMENT");
        this.addQuestion(q94);
        com.example.valero.bookkeepingnciii.Question q95 = new com.example.valero.bookkeepingnciii.Question("The total amount reported for stockholders' equity is the approximate fair value or net worth of the corporation as of the balance sheet date. ", "True", "Maybe", "False", "False", "INCOME STATEMENT");
        this.addQuestion(q95);
        com.example.valero.bookkeepingnciii.Question q96 = new com.example.valero.bookkeepingnciii.Question("The balance sheet heading will specify a  ", "Period of time", "Point in time ", "Service in time", "Point in time", "INCOME STATEMENT");
        this.addQuestion(q96);
        com.example.valero.bookkeepingnciii.Question q97 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for an asset account? ", "Credit", "Debit", "Balance sheet", "Debit", "INCOME STATEMENT");
        this.addQuestion(q97);
        com.example.valero.bookkeepingnciii.Question q98 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for liability accounts?", "Debit", "Debit and Credit", "Credit", "Credit", "INCOME STATEMENT");
        this.addQuestion(q98);
        com.example.valero.bookkeepingnciii.Question q99 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for contra asset accounts?", "Credit", "Balance sheet", "Debit", "Credit", "INCOME STATEMENT");
        this.addQuestion(q99);
        com.example.valero.bookkeepingnciii.Question q100 = new com.example.valero.bookkeepingnciii.Question("What is the normal balance for stockholders' equity and owner's equity accounts? ", "Both Debit and Credit", "Debit", "Credit", "Credit", "INCOME STATEMENT");
        this.addQuestion(q100);

//BANK RECONCILIATION
        com.example.valero.bookkeepingnciii.Question q101 = new com.example.valero.bookkeepingnciii.Question("Liability → From the bank's point of view money the business has in the bank represents this. ", "True", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q101);
        com.example.valero.bookkeepingnciii.Question q102 = new com.example.valero.bookkeepingnciii.Question(" Direct deposits → The business can authorise the bank to accept deposits on its behalf. Only when the bank statement is issued does the business receive confirmation of the increase in its deposits. Rent Revenue is commonly deposited directly inot the business's bank account.", "Tre ", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q102);
        com.example.valero.bookkeepingnciii.Question q103 = new com.example.valero.bookkeepingnciii.Question(" Debit column → Cheques recorded in the cash payments journal are checked with this column in the bank statement.", "True", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q103);
        com.example.valero.bookkeepingnciii.Question q104 = new com.example.valero.bookkeepingnciii.Question("Bank statement → Document produced by the bank which shows the cash held by a business with the bank. It lists the deposits, withdrawals and balance of the business's bank account over a stated time period usually one month. ", "False", "True", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q104);
        com.example.valero.bookkeepingnciii.Question q105 = new com.example.valero.bookkeepingnciii.Question(" Overdraft → When the business's bank statement shows a Debit balance. This means the business is now an asset to the bank because it owes the bank back the money it has overdrawn its account by.", "True", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q105);
        com.example.valero.bookkeepingnciii.Question q106 = new com.example.valero.bookkeepingnciii.Question(" Checks that have been written by a company but have not yet been charged to the company's checking account are referred to as OUTSTANDING checks.", "True", "False ", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q106);
        com.example.valero.bookkeepingnciii.Question q107 = new com.example.valero.bookkeepingnciii.Question("A company's receipts from September 30 that get deposited to the company's bank account on October 1st are referred to as deposits IN TRANSIT as of September 30.", "True", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q107);
        com.example.valero.bookkeepingnciii.Question q108 = new com.example.valero.bookkeepingnciii.Question("A general guide for reconciling the bank statement is Put it where it ISN'T", "True", "False", "", "True", "BANK RECONCILIATION");
        this.addQuestion(q108);
        com.example.valero.bookkeepingnciii.Question q109 = new com.example.valero.bookkeepingnciii.Question("Your are reconciling the bank statement balance to the cash book balance. Do you need to plus or minus bank transfers from customers?", "Minus", "Plus", "", "Minus", "BANK RECONCILIATION");
        this.addQuestion(q109);
        com.example.valero.bookkeepingnciii.Question q110 = new com.example.valero.bookkeepingnciii.Question("You are reconciling the bank statement balance to the cash book balance, do you need to plus or minus bank charges?", "Plus", "Minus", "Plus", "", "BANK RECONCILIATION");
        this.addQuestion(q110);
//ACCOUNTS PAYABLE
        com.example.valero.bookkeepingnciii.Question q111 = new com.example.valero.bookkeepingnciii.Question("A __________ balance is typical for Accounts Payable. ", "Debit", "Credit", "", "Credit", "ACCOUNTS PAYABLE");
        this.addQuestion(q111);
        com.example.valero.bookkeepingnciii.Question q112 = new com.example.valero.bookkeepingnciii.Question("The balance in Accounts Payable is decreased with a __________ entry. ", "Debit ", "Credit", "", "Debit", "ACCOUNTS PAYABLE");
        this.addQuestion(q112);
        com.example.valero.bookkeepingnciii.Question q113 = new com.example.valero.bookkeepingnciii.Question("An account payable on the books of the buyer should be an account RECEIVABLE on the books of the seller. ", "True", "False", "", "True", "ACCOUNTS PAYABLE");
        this.addQuestion(q113);
        com.example.valero.bookkeepingnciii.Question q114 = new com.example.valero.bookkeepingnciii.Question(" Accounts payable are also known as TRADE  payables.", "False", "True", "", "True", "ACCOUNTS PAYABLE");
        this.addQuestion(q114);
        com.example.valero.bookkeepingnciii.Question q115 = new com.example.valero.bookkeepingnciii.Question("Suppliers are also referred to as __________. ", "Vendors", "Debtors", "", "Vendors", "ACCOUNTS PAYABLE");
        this.addQuestion(q115);
        com.example.valero.bookkeepingnciii.Question q116 = new com.example.valero.bookkeepingnciii.Question("When you make a cash payment to an account supplier you debit or credit accounts payable?", "Debit", "Credit ", "", "Debit", "ACCOUNTS PAYABLE");
        this.addQuestion(q116);
        com.example.valero.bookkeepingnciii.Question q117 = new com.example.valero.bookkeepingnciii.Question("An accounts payable ledger account would normally have a debit or credit balance?", "Debit", "Credit", "", "Credit", "ACCOUNTS PAYABLE");
        this.addQuestion(q117);
        com.example.valero.bookkeepingnciii.Question q118 = new com.example.valero.bookkeepingnciii.Question("When you post vouchers to GL, it creates a debit entry to AP and credit to Expense account.  True or False", "True", "False", "", "False", "ACCOUNTS PAYABLE");
        this.addQuestion(q118);
        com.example.valero.bookkeepingnciii.Question q119 = new com.example.valero.bookkeepingnciii.Question("A purchase return would result in a debit or credit entry to accounts payable?", "Debit", "Credit", "", "Debit", "ACCOUNTS PAYABLE");
        this.addQuestion(q119);
        com.example.valero.bookkeepingnciii.Question q120 = new com.example.valero.bookkeepingnciii.Question("Another name for accounts payable is?", "Trade debtors", "Trade creditors", "Creditors", "Trade creditors", "ACCOUNTS PAYABLE");
        this.addQuestion(q120);

//INVENTORY COST OF GOOD SOLD
        com.example.valero.bookkeepingnciii.Question q121 = new com.example.valero.bookkeepingnciii.Question("A retailer's inventory cost should include freight-in on the merchandise purchased with terms FOB shipping point? ", "True", "False", "", "True", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q121);
        com.example.valero.bookkeepingnciii.Question q122 = new com.example.valero.bookkeepingnciii.Question("The inventory system that does NOT update the Inventory account automatically at the time of each purchase or sales is the PERPETUAL method/system ", "True ", "False", "", "True", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q122);
        com.example.valero.bookkeepingnciii.Question q123 = new com.example.valero.bookkeepingnciii.Question("The account Inventory will appear on the balance sheet as a current asset at an amount that often reflects the SALES VALUE of the merchandise on hand. ", "False", "True", "", "False(Cost)", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q123);
        com.example.valero.bookkeepingnciii.Question q124 = new com.example.valero.bookkeepingnciii.Question("Net Purchases is Gross Purchases minus Purchase Returns and Allowances and SALES DISCOUNT.", "False", "True", "", "True", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q124);
        com.example.valero.bookkeepingnciii.Question q125 = new com.example.valero.bookkeepingnciii.Question("The difference between the Cost of Goods Available and the Cost of Goods Sold is STARTING INVENTORY. ", "True", "False", "False", "False(Ending inventory)", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q125);
        com.example.valero.bookkeepingnciii.Question q126 = new com.example.valero.bookkeepingnciii.Question("When the terms of a sale are FOB destination, legal title to the goods passes to the buyer when they reach the buyer’s place of business.", "True", "False ", "", "True", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q126);
        com.example.valero.bookkeepingnciii.Question q127 = new com.example.valero.bookkeepingnciii.Question("When a purchaser incurs freight costs for the purchase of merchandise, the purchases account is debited.", "True", "False", "", "False", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q127);
        com.example.valero.bookkeepingnciii.Question q128 = new com.example.valero.bookkeepingnciii.Question("Under FIFO, the cost of goods sold consists of the units with the oldest costs.", "True", "False", "", "True", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q128);
        com.example.valero.bookkeepingnciii.Question q129 = new com.example.valero.bookkeepingnciii.Question("In a period of inflation, LIFO produces higher net earnings than FIFO.", "True", "False", "", "False", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q129);
        com.example.valero.bookkeepingnciii.Question q130 = new com.example.valero.bookkeepingnciii.Question("The days in inventory is calculated by dividing the inventory turnover ratio by 365.", "True", "False", "", "False", "INVENTORY COST OF GOOD SOLD");
        this.addQuestion(q130);

//DEPRECIATION
        com.example.valero.bookkeepingnciii.Question q131 = new com.example.valero.bookkeepingnciii.Question("Depreciation Expense shown on a company's income statement must be the same amount as the depreciation expense on the company's income tax return. ", "True", "False", "", "False", "DEPRECIATION");
        this.addQuestion(q131);
        com.example.valero.bookkeepingnciii.Question q132 = new com.example.valero.bookkeepingnciii.Question("The purpose of depreciation is to have the balance sheet report the current value of an asset.", "True ", "False", "", "False", "DEPRECIATION");
        this.addQuestion(q132);
        com.example.valero.bookkeepingnciii.Question q133 = new com.example.valero.bookkeepingnciii.Question("Depreciation Expense reflects an allocation of an asset's original cost rather than an allocation based on the economic value that is being consumed. ", "True", "False", "", "False", "DEPRECIATION");
        this.addQuestion(q133);
        com.example.valero.bookkeepingnciii.Question q134 = new com.example.valero.bookkeepingnciii.Question("An asset's useful life is the same as its physical life?", "False", "True", "", "False", "DEPRECIATION");
        this.addQuestion(q134);
        com.example.valero.bookkeepingnciii.Question q135 = new com.example.valero.bookkeepingnciii.Question("One company might depreciate a new computer over three years while another company might depreciate the same model computer over five years...and both companies are right. ", "True", "False", "", "True", "DEPRECIATION");
        this.addQuestion(q135);
        com.example.valero.bookkeepingnciii.Question q136 = new com.example.valero.bookkeepingnciii.Question("Depreciation Expense is shown on the income statement in order to achieve accounting's matching principle.", "True", "False ", "", "True", "DEPRECIATION");
        this.addQuestion(q136);
        com.example.valero.bookkeepingnciii.Question q137 = new com.example.valero.bookkeepingnciii.Question("Accumulated Depreciation will appear as a deduction within the section of the balance sheet labeled as Property, Plant and Equipment.", "True", "False", "", "True", "DEPRECIATION");
        this.addQuestion(q137);
        com.example.valero.bookkeepingnciii.Question q138 = new com.example.valero.bookkeepingnciii.Question("A company may depreciate equipment over 10 years on a straight-line basis for its financial statements, but might use an accelerated method of depreciation over a shorter time period on its income tax return?", "True", "False", "", "True", "DEPRECIATION");
        this.addQuestion(q138);
        com.example.valero.bookkeepingnciii.Question q139 = new com.example.valero.bookkeepingnciii.Question("Depreciation Expense is sometimes referred to as a noncash expense.", "True", "False", "", "True", "DEPRECIATION");
        this.addQuestion(q139);
        com.example.valero.bookkeepingnciii.Question q140 = new com.example.valero.bookkeepingnciii.Question("Depreciation Expense shown on the financial statements is a precise amount that is continuously refined.", "True", "False", "", "False", "DEPRECIATION");
        this.addQuestion(q140);

//PAYROLL ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q141 = new com.example.valero.bookkeepingnciii.Question("Amounts deducted from gross pay for union subscriptions are represented by a debit or credit to the deductions control account? ", "Debit", "Credit", "", "Credit", "PAYROLL ACCOUNTING");
        this.addQuestion(q141);
        com.example.valero.bookkeepingnciii.Question q142 = new com.example.valero.bookkeepingnciii.Question("Employee tax and deductions are part of gross pay? ", "True ", "False", "", "True", "PAYROLL ACCOUNTING");
        this.addQuestion(q142);
        com.example.valero.bookkeepingnciii.Question q143 = new com.example.valero.bookkeepingnciii.Question("Is gross pay a debit or a credit to the income statement? ", "Debit", "Credit", "", "Debit", "PAYROLL ACCOUNTING");
        this.addQuestion(q143);
        com.example.valero.bookkeepingnciii.Question q144 = new com.example.valero.bookkeepingnciii.Question("When cash is paid to an employee for net pay, is the entry to the net pay control account a debit or a credit.", "Debit", "Credit", "", "Debit", "PAYROLL ACCOUNTING");
        this.addQuestion(q144);
        com.example.valero.bookkeepingnciii.Question q145 = new com.example.valero.bookkeepingnciii.Question("When cash is paid to the tax authorities, is the posting to the employees tax control account a debit or credit.", "Debit", "Credit", "", "Debit", "PAYROLL ACCOUNTING");
        this.addQuestion(q145);
        com.example.valero.bookkeepingnciii.Question q146 = new com.example.valero.bookkeepingnciii.Question("An employer can legally pay a woman different wages than a man based on the nature of the work.", "True", "False ", "", "True", "PAYROLL ACCOUNTING");
        this.addQuestion(q146);
        com.example.valero.bookkeepingnciii.Question q147 = new com.example.valero.bookkeepingnciii.Question("Record used in preparing employee's W-2 → Employee's earnings record", "False", "True", "", "True", "PAYROLL ACCOUNTING");
        this.addQuestion(q147);
        com.example.valero.bookkeepingnciii.Question q148 = new com.example.valero.bookkeepingnciii.Question("Highest-paid 10 percent of workforce can be exempted → Workers' compensation insurance", "True", "False", "", "False", "PAYROLL ACCOUNTING");
        this.addQuestion(q148);
        com.example.valero.bookkeepingnciii.Question q149 = new com.example.valero.bookkeepingnciii.Question("Anti discrimination orders for employers with contracts involving federal funds → Executive orders", "True", "False", "", "True", "PAYROLL ACCOUNTING");
        this.addQuestion(q149);
        com.example.valero.bookkeepingnciii.Question q150 = new com.example.valero.bookkeepingnciii.Question("Also known as the Federal Wage and Hour Law → Unemployment insurance taxes", "True", "False", "", "False", "PAYROLL ACCOUNTING");
        this.addQuestion(q150);

//STOCKHOLHER EQUITY
        com.example.valero.bookkeepingnciii.Question q151 = new com.example.valero.bookkeepingnciii.Question("Dividends appear as an expense on the corporation's income statement. ", "True", "False", "", "False", "STOCKHOLDER EQUITY");
        this.addQuestion(q151);
        com.example.valero.bookkeepingnciii.Question q152 = new com.example.valero.bookkeepingnciii.Question("If the board of directors does not declare the regular quarterly divided on its common stock, the corporation's liabilities will include the omitted dividend. ", "True ", "False", "", "False", "STOCKHOLDER EQUITY");
        this.addQuestion(q152);
        com.example.valero.bookkeepingnciii.Question q153 = new com.example.valero.bookkeepingnciii.Question("Treasury stock sales can result in a loss on the corporation's income statement. ", "False", "True", "", "False", "STOCKHOLDER EQUITY");
        this.addQuestion(q153);
        com.example.valero.bookkeepingnciii.Question q154 = new com.example.valero.bookkeepingnciii.Question("Shares of stock that have been issued and have not been reacquired by the issuing corporation are called OUTSTANDING  shares.", "False", "True", "", "True", "STOCKHOLDER EQUITY");
        this.addQuestion(q154);
        com.example.valero.bookkeepingnciii.Question q155 = new com.example.valero.bookkeepingnciii.Question("If a corporation has issued only one type of stock, it is COMMON stock.", "True", "False", "False", "True", "STOCKHOLDER EQUITY");
        this.addQuestion(q155);
        com.example.valero.bookkeepingnciii.Question q156 = new com.example.valero.bookkeepingnciii.Question("The UNCOMMON date determines which stockholders will receive a declared dividend.", "True", "False ", "", "False(Record)", "STOCKHOLDER EQUITY");
        this.addQuestion(q156);
        com.example.valero.bookkeepingnciii.Question q157 = new com.example.valero.bookkeepingnciii.Question("The COMMON date is the date on which the corporation records a liability for its quarterly dividend.", "True", "False", "", "False(Declaration)", "STOCKHOLDER EQUITY");
        this.addQuestion(q157);
        com.example.valero.bookkeepingnciii.Question q158 = new com.example.valero.bookkeepingnciii.Question("If a corporation has issued only one type of stock, it is DECLARATION stock.", "True", "False", "", "True", "STOCKHOLDER EQUITY");
        this.addQuestion(q158);
        com.example.valero.bookkeepingnciii.Question q159 = new com.example.valero.bookkeepingnciii.Question("Dividends in arrears occur only on DECLARATION preferred stock.", "True", "False", "", "False(Convertible", "STOCKHOLDER EQUITY");
        this.addQuestion(q159);
        com.example.valero.bookkeepingnciii.Question q160 = new com.example.valero.bookkeepingnciii.Question("The directors of a corporation appoint BOARD ON DIRECTOR to carry out the corporation's policies and directives.", "True", "False", "", "True", "STOCKHOLDER EQUITY");
        this.addQuestion(q160);

//NONPROFIT ACCOUNTING
        com.example.valero.bookkeepingnciii.Question q161 = new com.example.valero.bookkeepingnciii.Question("Depreciation expense is reported for a not-for-profit organization's equipment and furniture. ", "True", "False", "", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q161);
        com.example.valero.bookkeepingnciii.Question q162 = new com.example.valero.bookkeepingnciii.Question("Assets released from restrictions will involve two classes of net assets. ", "True ", "False", "", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q162);
        com.example.valero.bookkeepingnciii.Question q163 = new com.example.valero.bookkeepingnciii.Question("US GAAP requires that the external financial statements of a nonprofit report information by funds. ", "False", "True", "", "False", "NONPROFIT ACCOUNTING");
        this.addQuestion(q163);
        com.example.valero.bookkeepingnciii.Question q164 = new com.example.valero.bookkeepingnciii.Question("Nonprofits are automatically exempt from federal income taxes.", "False", "True", "", "False", "NONPROFIT ACCOUNTING");
        this.addQuestion(q164);
        com.example.valero.bookkeepingnciii.Question q165 = new com.example.valero.bookkeepingnciii.Question("It is permissible for a nonprofit to earn a profit.", "True", "False", "False", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q165);
        com.example.valero.bookkeepingnciii.Question q166 = new com.example.valero.bookkeepingnciii.Question("Like other governmental funds, proprietary funds have no emphasis on income measurement.", "True", "False", "", "False", "NONPROFIT ACCOUNTING");
        this.addQuestion(q166);
        com.example.valero.bookkeepingnciii.Question q167 = new com.example.valero.bookkeepingnciii.Question("Like other governmental funds, proprietary funds have no emphasis on income measurement.", "True", "False", "", "False", "NONPROFIT ACCOUNTING");
        this.addQuestion(q167);
        com.example.valero.bookkeepingnciii.Question q168 = new com.example.valero.bookkeepingnciii.Question("One purpose of an internal service fund is to pool the government's resources for a more efficient operation in carrying out the fund's purpose.", "True", "False", "", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q168);
        com.example.valero.bookkeepingnciii.Question q169 = new com.example.valero.bookkeepingnciii.Question("Enterprise funds are used for \"business-type\" activities, and internal service funds are used predominantly for \"governmental-type\" activities.", "True", "False", "", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q169);
        com.example.valero.bookkeepingnciii.Question q170 = new com.example.valero.bookkeepingnciii.Question("US GAAP requires that the external financial statements of a nonprofit report information by funds.", "True", "False", "", "True", "NONPROFIT ACCOUNTING");
        this.addQuestion(q170);


        //
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(com.example.valero.bookkeepingnciii.Question quest) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_CATEGORY, quest.getCATEGORY());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<com.example.valero.bookkeepingnciii.Question> quesList = new ArrayList<com.example.valero.bookkeepingnciii.Question>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_QUEST;
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
        String filterQuery = "SELECT * FROM quest WHERE category LIKE '" + identifier + "'";
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