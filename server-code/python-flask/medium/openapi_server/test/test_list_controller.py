import unittest

from flask import json

from openapi_server.models.list_list_id_articles_get200_response import ListListIdArticlesGet200Response  # noqa: E501
from openapi_server.models.list_list_id_get200_response import ListListIdGet200Response  # noqa: E501
from openapi_server.models.list_list_id_responses_get200_response import ListListIdResponsesGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestListController(BaseTestCase):
    """ListController integration test stubs"""

    def test_list_list_id_articles_get(self):
        """Test case for list_list_id_articles_get

        Get List Articles
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/list/{list_id}/articles'.format(list_id='38f9e0f9bea6'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_list_id_get(self):
        """Test case for list_list_id_get

        Get List Info
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/list/{list_id}'.format(list_id='38f9e0f9bea6'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_list_id_responses_get(self):
        """Test case for list_list_id_responses_get

        Get List Responses
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/list/{list_id}/responses'.format(list_id='38f9e0f9bea6'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
