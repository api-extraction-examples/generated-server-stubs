import unittest

from flask import json

from openapi_server.models.rate_table_response import RateTableResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRateTableController(BaseTestCase):
    """RateTableController integration test stubs"""

    def test_get_rate_tables(self):
        """Test case for get_rate_tables

        
        """
        query_string = [('country_code', 'country_code_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/rate_table',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
