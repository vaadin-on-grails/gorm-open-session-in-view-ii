package app

import com.myapp.User
import com.vaadin.data.util.BeanItem
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.ComboBox
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest r) {

        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        ComboBox userAccount = new ComboBox()

        User user = User.findAll()[0]
        BeanItem item = new BeanItem(user, 'label')

        userAccount.addItem(item)

        layout.addComponent(userAccount)
        setContent(layout)
    }
}
