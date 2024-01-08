import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestStatusCodesController(BaseTestCase):
    """StatusCodesController integration test stubs"""

    def test_status_codes_delete(self):
        """Test case for status_codes_delete

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_codes_get(self):
        """Test case for status_codes_get

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_codes_patch(self):
        """Test case for status_codes_patch

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_codes_post(self):
        """Test case for status_codes_post

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_codes_put(self):
        """Test case for status_codes_put

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_codes_trace(self):
        """Test case for status_codes_trace

        Return status code or random status code if more than one are given
        """
        headers = { 
        }
        response = self.client.open(
            '/status/{codes}'.format(codes='codes_example'),
            method='TRACE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
