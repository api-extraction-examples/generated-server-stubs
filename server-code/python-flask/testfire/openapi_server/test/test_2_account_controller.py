import unittest

from flask import json

from openapi_server.models.dates import Dates  # noqa: E501
from openapi_server.test import BaseTestCase


class Test2AccountController(BaseTestCase):
    """2AccountController integration test stubs"""

    def test_get_account(self):
        """Test case for get_account

        
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/account',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_account_balance(self):
        """Test case for get_account_balance

        
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/account/{account_no}'.format(account_no='account_no_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_transactions(self):
        """Test case for get_transactions

        
        """
        body = openapi_server.Dates()
        headers = { 
            'Content-Type': 'application/json',
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/account/{account_no}/transactions'.format(account_no='account_no_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_show_last_ten_transactions(self):
        """Test case for show_last_ten_transactions

        
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/account/{account_no}/transactions'.format(account_no='account_no_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
