import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.publication_type_search_result import PublicationTypeSearchResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPublicationTypesController(BaseTestCase):
    """PublicationTypesController integration test stubs"""

    def test_api_v1_publication_types_get(self):
        """Test case for api_v1_publication_types_get

        Returns a list of publication types.
        """
        query_string = [('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/PublicationTypes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
