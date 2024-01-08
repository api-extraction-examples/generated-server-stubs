import unittest

from flask import json

from openapi_server.models.column_item import ColumnItem  # noqa: E501
from openapi_server.models.group_name import GroupName  # noqa: E501
from openapi_server.models.new_user_details import NewUserDetails  # noqa: E501
from openapi_server.models.page_bean_user import PageBeanUser  # noqa: E501
from openapi_server.models.unrestricted_user_email import UnrestrictedUserEmail  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_migration_bean import UserMigrationBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_bulk_get_users(self):
        """Test case for bulk_get_users

        Bulk get users
        """
        query_string = [('startAt', 0),
                        ('maxResults', 10),
                        ('username', ['username_example']),
                        ('key', ['key_example']),
                        ('accountId', ['5b10ac8d82e05b22cc7d4ef5'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/bulk',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bulk_get_users_migration(self):
        """Test case for bulk_get_users_migration

        Get account IDs for users
        """
        query_string = [('startAt', 0),
                        ('maxResults', 10),
                        ('username', ['username_example']),
                        ('key', ['key_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/bulk/migration',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_user(self):
        """Test case for create_user

        Create user
        """
        new_user_details = {"applicationKeys":["applicationKeys","applicationKeys"],"emailAddress":"emailAddress","password":"password","displayName":"displayName","name":"name","self":"self","key":"key","products":["products","products"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user',
            method='POST',
            headers=headers,
            data=json.dumps(new_user_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_users(self):
        """Test case for get_all_users

        Get all users
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/users/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_users_default(self):
        """Test case for get_all_users_default

        Get all users default
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/users',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user(self):
        """Test case for get_user

        Get user
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('username', 'username_example'),
                        ('key', 'key_example'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_default_columns(self):
        """Test case for get_user_default_columns

        Get user default columns
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('username', 'username_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/columns',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_email(self):
        """Test case for get_user_email

        Get user email
        """
        query_string = [('accountId', 'account_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/email',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_email_bulk(self):
        """Test case for get_user_email_bulk

        Get user email bulk
        """
        query_string = [('accountId', ['account_id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/email/bulk',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_groups(self):
        """Test case for get_user_groups

        Get user groups
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('username', 'username_example'),
                        ('key', 'key_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/groups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user(self):
        """Test case for remove_user

        Delete user
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('username', 'username_example'),
                        ('key', 'key_example')]
        headers = { 
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_user_columns(self):
        """Test case for reset_user_columns

        Reset user default columns
        """
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5'),
                        ('username', 'username_example')]
        headers = { 
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/columns',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_set_user_columns(self):
        """Test case for set_user_columns

        Set user default columns
        """
        request_body = ['request_body_example']
        query_string = [('accountId', '5b10ac8d82e05b22cc7d4ef5')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/columns',
            method='PUT',
            headers=headers,
            data=json.dumps(request_body),
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
