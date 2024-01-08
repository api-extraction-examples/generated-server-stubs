import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestAnythingController(BaseTestCase):
    """AnythingController integration test stubs"""

    def test_anything_anything_delete(self):
        """Test case for anything_anything_delete

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_anything_get(self):
        """Test case for anything_anything_get

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_anything_patch(self):
        """Test case for anything_anything_patch

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_anything_post(self):
        """Test case for anything_anything_post

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_anything_put(self):
        """Test case for anything_anything_put

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_anything_trace(self):
        """Test case for anything_anything_trace

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything/{anything}'.format(anything='anything_example'),
            method='TRACE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_delete(self):
        """Test case for anything_delete

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_get(self):
        """Test case for anything_get

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_patch(self):
        """Test case for anything_patch

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_post(self):
        """Test case for anything_post

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_put(self):
        """Test case for anything_put

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_anything_trace(self):
        """Test case for anything_trace

        Returns anything passed in request data.
        """
        headers = { 
        }
        response = self.client.open(
            '/anything',
            method='TRACE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
