import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestResponseInspectionController(BaseTestCase):
    """ResponseInspectionController integration test stubs"""

    def test_cache_get(self):
        """Test case for cache_get

        Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.
        """
        headers = { 
            'if_modified_since': 'if_modified_since_example',
            'if_none_match': 'if_none_match_example',
        }
        response = self.client.open(
            '/cache',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cache_value_get(self):
        """Test case for cache_value_get

        Sets a Cache-Control header for n seconds.
        """
        headers = { 
        }
        response = self.client.open(
            '/cache/{value}'.format(value=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_etag_etag_get(self):
        """Test case for etag_etag_get

        Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.
        """
        headers = { 
            'if_none_match': 'if_none_match_example',
            'if_match': 'if_match_example',
        }
        response = self.client.open(
            '/etag/{etag}'.format(etag='etag_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_response_headers_get(self):
        """Test case for response_headers_get

        Returns a set of response headers from the query string.
        """
        query_string = [('freeform', {'key': 'freeform_example'})]
        headers = { 
        }
        response = self.client.open(
            '/response-headers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_response_headers_post(self):
        """Test case for response_headers_post

        Returns a set of response headers from the query string.
        """
        query_string = [('freeform', {'key': 'freeform_example'})]
        headers = { 
        }
        response = self.client.open(
            '/response-headers',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
