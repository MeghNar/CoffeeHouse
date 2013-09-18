package userinterface;
/*
 * Author : Meghana Narasimhan
 */
import java.awt.Color;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.ui.forms.widgets.ColumnLayoutData;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;


public class CoffeeHouseUI extends Composite {
	private DataBindingContext m_bindingContext;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text;
	private Button btnClear;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CoffeeHouseUI(Composite parent, int style) {
		super(parent, style);
		setLayout(new ColumnLayout());
		
		Composite composite = new Composite(this, SWT.NONE);
		ColumnLayoutData cld_composite = new ColumnLayoutData();
		cld_composite.widthHint = 340;
		cld_composite.heightHint = 372;
		composite.setLayoutData(cld_composite);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(10, 326, 64, 36);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		formToolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Category 1");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setBounds(80, 326, 64, 36);
		formToolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Category 2");
		
		Button btnCategory = new Button(composite, SWT.NONE);
		btnCategory.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCategory.setText("Category 3");
		btnCategory.setBounds(150, 326, 64, 36);
		formToolkit.adapt(btnCategory, true, true);
		
		Button button = new Button(composite, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setText("Category 4");
		button.setBounds(220, 326, 64, 36);
		formToolkit.adapt(button, true, true);
		
		Button button_1 = new Button(composite, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1.setText("Category 5");
		button_1.setBounds(290, 326, 64, 36);
		formToolkit.adapt(button_1, true, true);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBounds(10, 75, 306, 245);
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setBounds(360, 20, 191, 342);
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);
		
		btnClear = new Button(composite_2, SWT.NONE);
		btnClear.setForeground(SWTResourceManager.getColor(255, 0, 0));
		btnClear.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnClear.setText("CLEAR");
		btnClear.setBounds(10, 306, 77, 36);

		formToolkit.adapt(btnClear, true, true);
		
		Button button_3 = new Button(composite_2, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_3.setText("PAY");
		button_3.setBounds(93, 306, 88, 36);
		formToolkit.adapt(button_3, true, true);
		
		text = new Text(composite_2, SWT.BORDER);
		text.setBounds(94, 279, 87, 21);
		formToolkit.adapt(text, true, true);
		
		Label lblNewLabel_1 = new Label(composite_2, SWT.NONE);
		lblNewLabel_1.setBounds(10, 279, 77, 21);
		formToolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Total : ");
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setBounds(10, 10, 124, 51);
		formToolkit.adapt(composite_3);
		formToolkit.paintBordersFor(composite_3);
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Meghana\\Greensboro\\HCI\\Project1\\coffeehouse.jpg"));
		lblNewLabel.setBounds(0, 0, 124, 51);
		formToolkit.adapt(lblNewLabel, true, true);
		m_bindingContext = initDataBindings();

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeBackgroundBtnClearObserveWidget = WidgetProperties.background().observe(btnClear);
		IObservableValue backgroundredFormToolkitgetColorsObserveValue = PojoProperties.value("background.red").observe(formToolkit.getColors());
		bindingContext.bindValue(observeBackgroundBtnClearObserveWidget, backgroundredFormToolkitgetColorsObserveValue, null, null);
		//
		return bindingContext;
	}
}
