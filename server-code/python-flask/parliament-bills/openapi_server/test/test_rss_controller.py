import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRssController(BaseTestCase):
    """RssController integration test stubs"""

    def test_api_v1_rss_allbills_rss_get(self):
        """Test case for api_v1_rss_allbills_rss_get

        Returns an Rss feed of all Bills.
        """
        headers = { 
        }
        response = self.client.open(
            '/api/v1/Rss/allbills.rss',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_rss_bills_id_rss_get(self):
        """Test case for api_v1_rss_bills_id_rss_get

        Returns an Rss feed of a certain Bill.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Rss/Bills/{id_rs}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_rss_privatebills_rss_get(self):
        """Test case for api_v1_rss_privatebills_rss_get

        Returns an Rss feed of private Bills.
        """
        headers = { 
        }
        response = self.client.open(
            '/api/v1/Rss/privatebills.rss',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_rss_publicbills_rss_get(self):
        """Test case for api_v1_rss_publicbills_rss_get

        Returns an Rss feed of public Bills.
        """
        headers = { 
        }
        response = self.client.open(
            '/api/v1/Rss/publicbills.rss',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
