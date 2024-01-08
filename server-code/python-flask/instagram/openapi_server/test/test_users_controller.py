import unittest

from flask import json

from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_users_search_get(self):
        """Test case for users_search_get

        Search for a user by name.
        """
        query_string = [('q', 'q_example'),
                        ('count', 56)]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_self_feed_get(self):
        """Test case for users_self_feed_get

        See the authenticated user's feed.
        """
        query_string = [('count', 56),
                        ('min_id', 'min_id_example'),
                        ('max_id', 'max_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/self/feed',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_self_media_liked_get(self):
        """Test case for users_self_media_liked_get

        See the list of media liked by the authenticated user.
        """
        query_string = [('count', 56),
                        ('max_like_id', 'max_like_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/self/media/liked',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_get(self):
        """Test case for users_user_id_get

        Get basic information about a user.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_media_recent_get(self):
        """Test case for users_user_id_media_recent_get

        Get the most recent media published by a user.
        """
        query_string = [('count', 56),
                        ('max_timestamp', 56),
                        ('min_timestamp', 56),
                        ('min_id', 'min_id_example'),
                        ('max_id', 'max_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}/media/recent'.format(user_id='user_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
