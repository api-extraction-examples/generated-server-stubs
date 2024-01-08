import unittest

from flask import json

from openapi_server.models.bill_type_category import BillTypeCategory  # noqa: E501
from openapi_server.models.bill_type_search_result import BillTypeSearchResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBillTypesController(BaseTestCase):
    """BillTypesController integration test stubs"""

    def test_api_v1_bill_types_get(self):
        """Test case for api_v1_bill_types_get

        Returns a list of Bill types.
        """
        query_string = [('Category', openapi_server.BillTypeCategory()),
                        ('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/BillTypes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
