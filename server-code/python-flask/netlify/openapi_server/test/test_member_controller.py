import unittest

from flask import json

from openapi_server.models.account_add_member_setup import AccountAddMemberSetup  # noqa: E501
from openapi_server.models.account_update_member_setup import AccountUpdateMemberSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.member import Member  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMemberController(BaseTestCase):
    """MemberController integration test stubs"""

    def test_add_member_to_account(self):
        """Test case for add_member_to_account

        
        """
        account_add_member_setup = openapi_server.AccountAddMemberSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/members'.format(account_slug='account_slug_example'),
            method='POST',
            headers=headers,
            data=json.dumps(account_add_member_setup),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_account_member(self):
        """Test case for get_account_member

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/members/{member_id}'.format(account_slug='account_slug_example', member_id='member_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_members_for_account(self):
        """Test case for list_members_for_account

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/members'.format(account_slug='account_slug_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_account_member(self):
        """Test case for remove_account_member

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/members/{member_id}'.format(account_slug='account_slug_example', member_id='member_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_account_member(self):
        """Test case for update_account_member

        
        """
        account_update_member_setup = openapi_server.AccountUpdateMemberSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/members/{member_id}'.format(account_slug='account_slug_example', member_id='member_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(account_update_member_setup),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
