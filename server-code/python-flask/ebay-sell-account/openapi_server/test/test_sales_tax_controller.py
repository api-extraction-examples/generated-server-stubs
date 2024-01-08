import unittest

from flask import json

from openapi_server.models.sales_tax import SalesTax  # noqa: E501
from openapi_server.models.sales_tax_base import SalesTaxBase  # noqa: E501
from openapi_server.models.sales_taxes import SalesTaxes  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSalesTaxController(BaseTestCase):
    """SalesTaxController integration test stubs"""

    def test_create_or_replace_sales_tax(self):
        """Test case for create_or_replace_sales_tax

        
        """
        sales_tax_base = {"salesTaxPercentage":"salesTaxPercentage","shippingAndHandlingTaxed":True}
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/sales_tax/{country_code}/{jurisdiction_id}'.format(country_code='country_code_example', jurisdiction_id='jurisdiction_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(sales_tax_base),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_sales_tax(self):
        """Test case for delete_sales_tax

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/sales_tax/{country_code}/{jurisdiction_id}'.format(country_code='country_code_example', jurisdiction_id='jurisdiction_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sales_tax(self):
        """Test case for get_sales_tax

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/sales_tax/{country_code}/{jurisdiction_id}'.format(country_code='country_code_example', jurisdiction_id='jurisdiction_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sales_taxes(self):
        """Test case for get_sales_taxes

        
        """
        query_string = [('country_code', 'country_code_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/sales_tax',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
