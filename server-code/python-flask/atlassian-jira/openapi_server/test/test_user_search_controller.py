import unittest

from flask import json

from openapi_server.models.found_users import FoundUsers  # noqa: E501
from openapi_server.models.page_bean_user import PageBeanUser  # noqa: E501
from openapi_server.models.page_bean_user_key import PageBeanUserKey  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserSearchController(BaseTestCase):
    """UserSearchController integration test stubs"""

    def test_find_assignable_users(self):
        """Test case for find_assignable_users

        Find users assignable to issues
        """
        query_string = [('query', 'query'),
                        ('sessionId', 'session_id_example'),
                        ('username', 'username_example'),
                        ('accountId', 'account_id_example'),
                        ('project', 'project_example'),
                        ('issueKey', 'issue_key_example'),
                        ('startAt', 0),
                        ('maxResults', 50),
                        ('actionDescriptorId', 56),
                        ('recommend', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/assignable/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_bulk_assignable_users(self):
        """Test case for find_bulk_assignable_users

        Find users assignable to projects
        """
        query_string = [('query', 'query'),
                        ('username', 'username_example'),
                        ('accountId', 'account_id_example'),
                        ('projectKeys', 'project_keys_example'),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/assignable/multiProjectSearch',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_user_keys_by_query(self):
        """Test case for find_user_keys_by_query

        Find user keys by query
        """
        query_string = [('query', 'query_example'),
                        ('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/search/query/key',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_users(self):
        """Test case for find_users

        Find users
        """
        query_string = [('query', 'query'),
                        ('username', 'username_example'),
                        ('accountId', 'account_id_example'),
                        ('startAt', 0),
                        ('maxResults', 50),
                        ('property', '_property_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_users_by_query(self):
        """Test case for find_users_by_query

        Find users by query
        """
        query_string = [('query', 'query_example'),
                        ('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/search/query',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_users_for_picker(self):
        """Test case for find_users_for_picker

        Find users for picker
        """
        query_string = [('query', 'query_example'),
                        ('maxResults', 50),
                        ('showAvatar', False),
                        ('exclude', ['exclude_example']),
                        ('excludeAccountIds', ['exclude_account_ids_example']),
                        ('avatarSize', 'avatar_size_example'),
                        ('excludeConnectUsers', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/picker',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_users_with_all_permissions(self):
        """Test case for find_users_with_all_permissions

        Find users with permissions
        """
        query_string = [('query', 'query'),
                        ('username', 'username_example'),
                        ('accountId', 'account_id_example'),
                        ('permissions', 'permissions_example'),
                        ('issueKey', 'issue_key_example'),
                        ('projectKey', 'project_key_example'),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/permission/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_users_with_browse_permission(self):
        """Test case for find_users_with_browse_permission

        Find users with browse permission
        """
        query_string = [('query', 'query'),
                        ('username', 'username_example'),
                        ('accountId', 'account_id_example'),
                        ('issueKey', 'issue_key_example'),
                        ('projectKey', 'project_key_example'),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/user/viewissue/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
