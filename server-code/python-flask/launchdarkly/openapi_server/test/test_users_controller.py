import unittest

from flask import json

from openapi_server.models.user_record import UserRecord  # noqa: E501
from openapi_server.models.users import Users  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_delete_user(self):
        """Test case for delete_user

        Delete a user by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}/{user_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_search_users(self):
        """Test case for get_search_users

        Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.
        """
        query_string = [('q', 'q_example'),
                        ('limit', 56),
                        ('offset', 56),
                        ('after', 56)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/user-search/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user(self):
        """Test case for get_user

        Get a user by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}/{user_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_users(self):
        """Test case for get_users

        List all users in the environment. Includes the total count of users. In each page, there will be up to 'limit' users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.
        """
        query_string = [('limit', 56),
                        ('h', 'h_example'),
                        ('scrollId', 'scroll_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
