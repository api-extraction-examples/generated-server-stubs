import unittest

from flask import json

from openapi_server.models.amendment_detail import AmendmentDetail  # noqa: E501
from openapi_server.models.amendment_search_item_search_result import AmendmentSearchItemSearchResult  # noqa: E501
from openapi_server.models.decision import Decision  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAmendmentsController(BaseTestCase):
    """AmendmentsController integration test stubs"""

    def test_get_amendment(self):
        """Test case for get_amendment

        Returns an amendment.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Stages/{bill_stage_id}/Amendments/{amendment_id}'.format(bill_id=56, bill_stage_id=56, amendment_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_amendments(self):
        """Test case for get_amendments

        Returns a list of amendments.
        """
        query_string = [('SearchTerm', 'search_term_example'),
                        ('Decision', openapi_server.Decision()),
                        ('MemberId', 56),
                        ('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Stages/{bill_stage_id}/Amendments'.format(bill_id=56, bill_stage_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
