import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.stage_reference_search_result import StageReferenceSearchResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStagesController(BaseTestCase):
    """StagesController integration test stubs"""

    def test_api_v1_stages_get(self):
        """Test case for api_v1_stages_get

        Returns a list of Bill stages.
        """
        query_string = [('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Stages',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
