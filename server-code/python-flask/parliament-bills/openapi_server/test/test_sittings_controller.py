import unittest

from flask import json

from openapi_server.models.bill_stage_sitting_search_result import BillStageSittingSearchResult  # noqa: E501
from openapi_server.models.house import House  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSittingsController(BaseTestCase):
    """SittingsController integration test stubs"""

    def test_get_sittings(self):
        """Test case for get_sittings

        Returns a list of Sittings.
        """
        query_string = [('House', openapi_server.House()),
                        ('DateFrom', '2013-10-20T19:20:30+01:00'),
                        ('DateTo', '2013-10-20T19:20:30+01:00'),
                        ('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Sittings',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
