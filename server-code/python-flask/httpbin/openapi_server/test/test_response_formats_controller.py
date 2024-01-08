import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestResponseFormatsController(BaseTestCase):
    """ResponseFormatsController integration test stubs"""

    def test_brotli_get(self):
        """Test case for brotli_get

        Returns Brotli-encoded data.
        """
        headers = { 
        }
        response = self.client.open(
            '/brotli',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deflate_get(self):
        """Test case for deflate_get

        Returns Deflate-encoded data.
        """
        headers = { 
        }
        response = self.client.open(
            '/deflate',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deny_get(self):
        """Test case for deny_get

        Returns page denied by robots.txt rules.
        """
        headers = { 
        }
        response = self.client.open(
            '/deny',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encoding_utf8_get(self):
        """Test case for encoding_utf8_get

        Returns a UTF-8 encoded body.
        """
        headers = { 
        }
        response = self.client.open(
            '/encoding/utf8',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_gzip_get(self):
        """Test case for gzip_get

        Returns GZip-encoded data.
        """
        headers = { 
        }
        response = self.client.open(
            '/gzip',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_html_get(self):
        """Test case for html_get

        Returns a simple HTML document.
        """
        headers = { 
        }
        response = self.client.open(
            '/html',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_json_get(self):
        """Test case for json_get

        Returns a simple JSON document.
        """
        headers = { 
        }
        response = self.client.open(
            '/json',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_robots_txt_get(self):
        """Test case for robots_txt_get

        Returns some robots.txt rules.
        """
        headers = { 
        }
        response = self.client.open(
            '/robots.txt',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_xml_get(self):
        """Test case for xml_get

        Returns a simple XML document.
        """
        headers = { 
        }
        response = self.client.open(
            '/xml',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
