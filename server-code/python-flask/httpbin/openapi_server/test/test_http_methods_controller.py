import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestHTTPMethodsController(BaseTestCase):
    """HTTPMethodsController integration test stubs"""

    def test_delete_delete(self):
        """Test case for delete_delete

        The request's DELETE parameters.
        """
        headers = { 
        }
        response = self.client.open(
            '/delete',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_get(self):
        """Test case for get_get

        The request's query parameters.
        """
        headers = { 
        }
        response = self.client.open(
            '/get',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_patch(self):
        """Test case for patch_patch

        The request's PATCH parameters.
        """
        headers = { 
        }
        response = self.client.open(
            '/patch',
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_post(self):
        """Test case for post_post

        The request's POST parameters.
        """
        headers = { 
        }
        response = self.client.open(
            '/post',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_put(self):
        """Test case for put_put

        The request's PUT parameters.
        """
        headers = { 
        }
        response = self.client.open(
            '/put',
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
