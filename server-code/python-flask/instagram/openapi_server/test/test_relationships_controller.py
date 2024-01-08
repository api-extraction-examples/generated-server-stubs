import unittest

from flask import json

from openapi_server.models.relationship_post_response import RelationshipPostResponse  # noqa: E501
from openapi_server.models.relationship_response import RelationshipResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server.models.users_paging_response import UsersPagingResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRelationshipsController(BaseTestCase):
    """RelationshipsController integration test stubs"""

    def test_users_self_requested_by_get(self):
        """Test case for users_self_requested_by_get

        List the users who have requested this user's permission to follow.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/self/requested-by',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_followed_by_get(self):
        """Test case for users_user_id_followed_by_get

        Get the list of users this user is followed by.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}/followed-by'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_follows_get(self):
        """Test case for users_user_id_follows_get

        Get the list of users this user follows.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}/follows'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_relationship_get(self):
        """Test case for users_user_id_relationship_get

        Get information about a relationship to another user.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}/relationship'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_user_id_relationship_post(self):
        """Test case for users_user_id_relationship_post

        Modify the relationship between the current user and the target user.
        """
        query_string = [('action', 'action_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{user_id}/relationship'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
