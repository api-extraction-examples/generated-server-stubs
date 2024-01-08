import unittest

from flask import json

from openapi_server.models.body import Body  # noqa: E501
from openapi_server.models.body1 import Body1  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.personalised_categories_response import PersonalisedCategoriesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPersonalisedCategoriesController(BaseTestCase):
    """PersonalisedCategoriesController integration test stubs"""

    def test_my_categories_follows_delete(self):
        """Test case for my_categories_follows_delete

        Unfollow category
        """
        body = openapi_server.Body1()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/categories/follows',
            method='DELETE',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_my_categories_follows_get(self):
        """Test case for my_categories_follows_get

        List of followed categories
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/categories/follows',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_my_categories_follows_post(self):
        """Test case for my_categories_follows_post

        Follow category
        """
        body = {"category_id":"category_id","platform":"responsiveweb"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/categories/follows',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
