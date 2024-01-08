import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestContractsController(BaseTestCase):
    """ContractsController integration test stubs"""

    def test_list_contracts_get(self):
        """Test case for list_contracts_get

        This endpoint returns contract history from FPDS for a specific vendor
        """
        query_string = [('duns', 'duns_example'),
                        ('naics', 'naics_example'),
                        ('sort', 'sort_example'),
                        ('direction', 'direction_example'),
                        ('page', 'page_example')]
        headers = { 
            'Accept': '*/*',
        }
        response = self.client.open(
            '/api/contracts/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
