package org.pro.seleniumx.locatorexample;

public class XpathDetails {

    /**
     * To get the location of a web element - Right CLick - Inspect -It highlight the tag on DOM at "Element" selection
     * Do Ctrl+F , a find text box open to enter path
     * If path 1 of 1 then it uniquely identify the element
     * https://demo.automationtesting.in/Register.html
     */

    /** Xpath are 2 types
     * 1 Absolute Xpath
     * 2 Relative Xpath
     *
     * 1 Absolute Xpath
     * It starts with / (root) of HTML DOM to till the desired element
     * To travers from top element to its next element we use / (operator)
     * To travers similar element inside a single element use tag name[index]
     * Example: /html/body/section/div/div/div[2]/form/div[1]/div[1]/input
     *
     *
     * 2 Relative Xpath
     * it starts with // (anywhere in DOM)
     * To travers from top element to its next element we use / (operator)
     * To travers similar element inside a single element use tag name[index]
     * Syntax: // tag name [@attribute = 'value']
     *
     * Example 1: By Single Attribute locate element
     * //input[@placeholder='First Name']
     *
     * Example 2:(*) any tag having this attribute
     * //*[@placeholder='First Name']
     *
     * Example 3: When an element is not located and other tag are in SAME HIERARCHY
     * Locate first element then travers to next element using /
     * //div[@class='form-group']/div/input
     *
     * Example 4:Parent element can locate but inside element cano not.Use Index
     * Locate first element then travers to Inside element using tag[index]
     * //div[@class='form-group']/link[4]
     *
     * Example 5:When inside an element multiples child element and each child has sub-Child and each sub-child has sub-sub-child element
     * In this case to travers using / it is a tedious, we can use // (anywhere under the parent element which located)
     * //div[@class='form-group']//link
     *
     * Example6: When single Attribute is not enough to uniquely identify a element we can use double attribute
     * //input[@placeholder='First Name'][@Class='Name']
     *
     * Example 7: When an element is located but its above element not , we can do reverse travers using /.. (1 element up)
     * //input[@placeholder='First Name']/..        One element up
     * //input[@placeholder='First Name']/../..     two element up
     *
     * Example 8: xpath using text() method (useful for label and link)
     * syntax : //tag[text()='text']
     * //label[text()='Full Name']
     *
     * Example 9: xpath using contains() method (useful when attribute are change but some part is fix)
     * syntax: //tag[contains(@attribute, 'attribute value part')
     * //button[contains(@id,'btnlogin')
     * //button[contains(text(),'btnlogin')
     *
     * Example 10: xpath using starts-with() method (useful when attribute are change but starting part is fix)
     * syntax: //tag[starts-with(@attribute, 'attribute value start value')
     * //button[starts-with(@class,'btn_')
     * //button[starts-with(text(),'btn_')
     *
     * Example 11:xpath using last() method (useful when we want to move last element of a parent tab without index
     * syntax: //tag[(@attribute, 'attribute value ')/tab[last()]
     * syntax: //tag[(@attribute, 'attribute value ')/tab[last()-number]
     * //div[@class='form-group']/link[4]           it is 4 link under the div and we move to 4th link
     * //div[@class='form-group']/link[last()]      it is 4 link under the div and we move to 4th link
     *
     * //div[@class='form-group']/link[2]           it is 4 link under the div and we move to 2th link
     * //div[@class='form-group']/link[last()-2]    it is 4 link under the div and we move to 2th link
     *
     * Example 12:xpath using last() method (useful for table tag)
     * syntax: //tag[count(.//tr)=3]        . means it search on current table // for tag search =3 means which table has 3 row
     *
     * Example 13: parent:: using in xpath (useful to move from child tag to its parent tab)
     * syntax: child tag/parent::parent tag[attribute]
     * //label[test()='password']/parent::td/parent::tr[@class='bac']     td is parent of child tag and tr is parent of td tag
     *
     * Example 14: ancestor : using in xpath (useful to move from child to any grandparent and it above)
     * syntax: child tag/ancestor:: grandparent tag or above tag[attribute]
     * //label[test()='password']/ancestor::table[@class='prq']    td is parent-tr is grandparent-table gret grandparent
     *
     * Example 15: child : using in xpath (useful to move from parent to any child)
     * syntax: child tag/child:: child tag[attribute]
     * //tbody[test()='tbl']/child::tr[@class='rowx']/child::lebel[text()='pwd']   table is parent-tr is child-label gret grand child
     *
     * Example 16: descendant : using in xpath (useful to move from parent to any grandchild  and it below)
     * syntax: parent tag/descendant:: child tag[attribute]
     * //tbody[test()='tbl']/descendant::lebel[text()='pwd']   table is parent-tr is child-label gret grand child
     *
     * Example 17: following : using in xpath (useful to move any below element)
     * syntax: tag/following::tag[attribute]
     * //tbody[test()='tbl']/following::lebel[text()='pwd']     any tag after the located tag
     *
     * Example 18: following-sibling : using in xpath (useful to move any element which are in same hierarchy by down travers)
     * syntax: tag/following-sibling::tag[attribute]
     * //tbody[test()='tbl']/following-sibling::lebel[text()='pwd']
     *
     * Example 19: preceding-sibling : using in xpath (useful to move any element which are in same hierarchy by up travers)
     * syntax: tag/preceding-sibling::tag[attribute]
     * //tbody[test()='tbl']/preceding-sibling::lebel[text()='pwd']
     *
     * Example 20: normalize-space() : using in xpath (useful when we compare text by removing leading space )
     * syntax: tag[normalize-space(text(), 'val')]
     * //tbody[normalize-space(text(), 'username')]
     *
     * Example 21:not() : using in xpath
     * syntax: tag[not(text(), 'val')]
     * //tbody[not(text(), 'username')]
     *
     * Example 22:and : using in xpath
     * syntax: tag[text(), 'val' and contains(text(),'val')]
     * //tbody[text(), 'username' and contains(text(),'pwd')]
     *
     * Example 23:or : using in xpath
     * syntax: tag[text(), 'val' or contains(text(),'val')]
     * //tbody[text(), 'username' or contains(text(),'pwd')]
     *
     * Example 24:. : using in xpath (useful when text() not work)
     * syntax: tag[contains(.,'val')
     * //tbody[contains(., 'username' )]
     *
     * Example 25: Position()
     * Syntax:
     * // (//Tab[@Attribute="Attribute value])[position(1)] to get first element
     * // (//Tab[@Attribute="Attribute value])[position()>1] to get the second
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
