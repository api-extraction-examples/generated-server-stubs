import unittest

from flask import json

from openapi_server.models.account_membership import AccountMembership  # noqa: E501
from openapi_server.models.account_setup import AccountSetup  # noqa: E501
from openapi_server.models.account_update_setup import AccountUpdateSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAccountMembershipController(BaseTestCase):
    """AccountMembershipController integration test stubs"""

    def test_cancel_account(self):
        """Test case for cancel_account

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}'.format(account_id='account_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_account(self):
        """Test case for create_account

        
        """
        account_setup = openapi_server.AccountSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts',
            method='POST',
            headers=headers,
            data=json.dumps(account_setup),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_account(self):
        """Test case for get_account

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}'.format(account_id='account_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_accounts_for_user(self):
        """Test case for list_accounts_for_user

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_account(self):
        """Test case for update_account

        
        """
        account_update_setup = openapi_server.AccountUpdateSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}'.format(account_id='account_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(account_update_setup),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
