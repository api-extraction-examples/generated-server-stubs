import unittest

from flask import json

from openapi_server.models.user_id_for_username_get200_response import UserIdForUsernameGet200Response  # noqa: E501
from openapi_server.models.user_user_id_articles_get200_response import UserUserIdArticlesGet200Response  # noqa: E501
from openapi_server.models.user_user_id_followers_get200_response import UserUserIdFollowersGet200Response  # noqa: E501
from openapi_server.models.user_user_id_following_get200_response import UserUserIdFollowingGet200Response  # noqa: E501
from openapi_server.models.user_user_id_get200_response import UserUserIdGet200Response  # noqa: E501
from openapi_server.models.user_user_id_interests_get200_response import UserUserIdInterestsGet200Response  # noqa: E501
from openapi_server.models.user_user_id_lists_get200_response import UserUserIdListsGet200Response  # noqa: E501
from openapi_server.models.user_user_id_publications_get200_response import UserUserIdPublicationsGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserController(BaseTestCase):
    """UserController integration test stubs"""

    def test_user_id_for_username_get(self):
        """Test case for user_id_for_username_get

        Get User ID
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/id_for/{username}'.format(username='nishu-jain'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_articles_get(self):
        """Test case for user_user_id_articles_get

        Get User's Articles
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/articles'.format(user_id='1985b61817c3'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_followers_get(self):
        """Test case for user_user_id_followers_get

        Get User Followers
        """
        query_string = [('count', 10)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/followers'.format(user_id='1985b61817c3'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_following_get(self):
        """Test case for user_user_id_following_get

        Get User Following
        """
        query_string = [('count', 10)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/following'.format(user_id='14d5c41e0264'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_get(self):
        """Test case for user_user_id_get

        Get User Info
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}'.format(user_id='1985b61817c3'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_interests_get(self):
        """Test case for user_user_id_interests_get

        Get User's Interests
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/interests'.format(user_id='1985b61817c3'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_lists_get(self):
        """Test case for user_user_id_lists_get

        Get User's Lists
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/lists'.format(user_id='5142451174a3'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_publications_get(self):
        """Test case for user_user_id_publications_get

        Get User's Publications
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/publications'.format(user_id='14d5c41e0264'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_user_id_top_articles_get(self):
        """Test case for user_user_id_top_articles_get

        Get User's Top Articles
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/user/{user_id}/top_articles'.format(user_id='1985b61817c3'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
