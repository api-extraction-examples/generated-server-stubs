import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestDynamicDataController(BaseTestCase):
    """DynamicDataController integration test stubs"""

    def test_base64_value_get(self):
        """Test case for base64_value_get

        Decodes base64url-encoded string.
        """
        headers = { 
        }
        response = self.client.open(
            '/base64/{value}'.format(value='SFRUUEJJTiBpcyBhd2Vzb21l'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bytes_nget(self):
        """Test case for bytes_nget

        Returns n random bytes generated with given seed
        """
        headers = { 
        }
        response = self.client.open(
            '/bytes/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_delete(self):
        """Test case for delay_delay_delete

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_get(self):
        """Test case for delay_delay_get

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_patch(self):
        """Test case for delay_delay_patch

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_post(self):
        """Test case for delay_delay_post

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_put(self):
        """Test case for delay_delay_put

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delay_delay_trace(self):
        """Test case for delay_delay_trace

        Returns a delayed response (max of 10 seconds).
        """
        headers = { 
        }
        response = self.client.open(
            '/delay/{delay}'.format(delay=56),
            method='TRACE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_drip_get(self):
        """Test case for drip_get

        Drips data over a duration after an optional initial delay.
        """
        query_string = [('duration', 2),
                        ('numbytes', 10),
                        ('code', 200),
                        ('delay', 2)]
        headers = { 
        }
        response = self.client.open(
            '/drip',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_links_n_offset_get(self):
        """Test case for links_n_offset_get

        Generate a page containing n links to other pages which do the same.
        """
        headers = { 
        }
        response = self.client.open(
            '/links/{n}/{offset}'.format(n=56, offset=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_range_numbytes_get(self):
        """Test case for range_numbytes_get

        Streams n random bytes generated with given seed, at given chunk size per packet.
        """
        headers = { 
        }
        response = self.client.open(
            '/range/{numbytes}'.format(numbytes=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stream_bytes_nget(self):
        """Test case for stream_bytes_nget

        Streams n random bytes generated with given seed, at given chunk size per packet.
        """
        headers = { 
        }
        response = self.client.open(
            '/stream-bytes/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stream_nget(self):
        """Test case for stream_nget

        Stream n JSON responses
        """
        headers = { 
        }
        response = self.client.open(
            '/stream/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_uuid_get(self):
        """Test case for uuid_get

        Return a UUID4.
        """
        headers = { 
        }
        response = self.client.open(
            '/uuid',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
