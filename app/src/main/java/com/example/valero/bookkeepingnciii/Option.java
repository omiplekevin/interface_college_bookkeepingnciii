package com.example.valero.bookkeepingnciii;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by user on 1/29/2016.
 */
public class Option extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);


        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(Option.this, Firstmenu.class));
                finish();
            }
        });


        Button showPopUpButton1 = (Button) findViewById(R.id.button1);
        showPopUpButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp1();
            }
        });
    }

//Pop up button for each topic
    private void showPopUp1() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Accounting basic");
        helpBuilder.setMessage("The relationship between income, expenses, and the ownership of the company. Income should equal the amount of expenses plus what owner puts up for the business.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton2 = (Button) findViewById(R.id.button2);
        showPopUpButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp2();
            }
        });
    }

    private void showPopUp2() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Debits and Credits");
        helpBuilder.setMessage("A debit is an accounting entry that either increases an asset or expense account, or decreases a liability or equity account. It is positioned to the left in an accounting entry. A credit is an accounting entry that either increases a liability or equity account, or decreases an asset or expense account.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton3 = (Button) findViewById(R.id.button3);
        showPopUpButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp3();
            }
        });
    }

    private void showPopUp3() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Chart og Account");
        helpBuilder.setMessage("A chart of accounts (COA) is a financial organizational tool that provides a complete listing of every account in an accounting system. An account is a unique record for each type of asset, liability, equity, revenue and expense.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();


        Button showPopUpButton5 = (Button) findViewById(R.id.button5);
        showPopUpButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp5();
            }
        });
    }

    private void showPopUp5() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Bookkeeping");
        helpBuilder.setMessage("Bookkeeping is the recording of financial transactions, and is part of the process of accounting in business.[1] Transactions include purchases, sales, receipts, and payments by an individual person or an organization/corporation. ");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();


        Button showPopUpButton6 = (Button) findViewById(R.id.button6);
        showPopUpButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp6();
            }
        });
    }

    private void showPopUp6() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Accounting Equation");
        helpBuilder.setMessage("The accounting equation is the process used to capture the effect of economic events; Assets = Liabilities + Owner’s Equity. It is encompassed on the balance sheet.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton7 = (Button) findViewById(R.id.button7);
        showPopUpButton7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp7();
            }
        });
    }

    private void showPopUp7() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Accounting Principle");
        helpBuilder.setMessage("a principle that governs current accounting practice and that is used as a reference to determine the appropriate treatment of complex transactions.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton8 = (Button) findViewById(R.id.button8);
        showPopUpButton8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp8();
            }
        });
    }

    private void showPopUp8() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Financial Accounting");
        helpBuilder.setMessage("Financial accounting is a specialized branch of accounting that keeps track of a company's financial transactions. Using standardized guidelines, the transactions are recorded, summarized, and presented in a financial report or financial statement such as an income statement or a balance sheet.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton9 = (Button) findViewById(R.id.button9);
        showPopUpButton9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp9();
            }
        });
    }

    private void showPopUp9() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Adjusting Entries");
        helpBuilder.setMessage("Adjusting entries are journal entries usually made at the end of an accounting period to allocate income and expenditure to the period in which they actually occurred.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton10 = (Button) findViewById(R.id.button10);
        showPopUpButton10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp10();
            }
        });
    }

    private void showPopUp10() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Balance Sheet");
        helpBuilder.setMessage("The balance sheet reports the assets, liabilities, and owner's (stockholders') equity at a specific point in time, such as December 31. The balance sheet is also referred to as the Statement of Financial Position.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton11 = (Button) findViewById(R.id.button11);
        showPopUpButton11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp11();
            }
        });
    }

    private void showPopUp11() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Income Statement");
        helpBuilder.setMessage("The income statement is a financial report that shows an entity's financial results over a specific period of time. The time period covered is usually for a month, quarter, or year, though it is possible that partial periods may also be used.");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton12 = (Button) findViewById(R.id.button12);
        showPopUpButton12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp12();
            }
        });
    }

    private void showPopUp12() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Bank Reconciliation");
        helpBuilder.setMessage("This is a Simple Pop Up");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });



        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton13 = (Button) findViewById(R.id.button13);
        showPopUpButton13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp13();
            }
        });
    }

    private void showPopUp13() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Accounts Payable");
        helpBuilder.setMessage("An account payable is a liability representing an amount owed to a creditor, usually arising from purchase of merchandise, materials, supplies, or services." +
                "An account payable is a bill to be paid, or money otherwise owed to a creditor. Accounts payable is a liabilities account, representing all such payables due for payment in the near term.");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton14 = (Button) findViewById(R.id.button14);
        showPopUpButton14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp14();
            }
        });
    }

    private void showPopUp14() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Inventory and cost of Good sold");
        helpBuilder.setMessage("Inventory is merchandise purchased by merchandisers (retailers, wholesalers, distributors) for the purpose of being sold to customers. The cost of the merchandise purchased but not yet sold is reported in the account Inventory or Merchandise Inventory." +
                "Inventory is reported as a current asset on the company's balance sheet. Inventory is a significant asset that needs to be monitored closely. Too much inventory can result in cash flow problems, additional expenses (e.g., storage, insurance), and losses if the items become obsolete. Too little inventory can result in lost sales and lost customers." +
                "Cost of goods sold is the cost of the merchandise that was sold to customers. The cost of goods sold is reported on the income statement when the sales revenues of the goods sold are reported.");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton15 = (Button) findViewById(R.id.button15);
        showPopUpButton15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp15();
            }
        });
    }

    private void showPopUp15() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Depreciation");
        helpBuilder.setMessage("This is a Simple Pop Up");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton16 = (Button) findViewById(R.id.button16);
        showPopUpButton16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp16();
            }
        });
    }

    private void showPopUp16() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Payroll Accounting");
        helpBuilder.setMessage("This is a Simple Pop Up");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton17 = (Button) findViewById(R.id.button17);
        showPopUpButton17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp17();
            }
        });
    }

    private void showPopUp17() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Stockholders equity");
        helpBuilder.setMessage("This is a Simple Pop Up");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

        Button showPopUpButton18 = (Button) findViewById(R.id.button18);
        showPopUpButton18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp18();
            }
        });
    }

    private void showPopUp18() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Nonprofit Accounting");
        helpBuilder.setMessage("This is a Simple Pop Up");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });


        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();






    }
}

