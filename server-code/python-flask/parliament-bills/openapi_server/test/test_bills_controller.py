import unittest

from flask import json

from openapi_server.models.bill import Bill  # noqa: E501
from openapi_server.models.bill_sort_order import BillSortOrder  # noqa: E501
from openapi_server.models.bill_stage_details import BillStageDetails  # noqa: E501
from openapi_server.models.bill_summary_search_result import BillSummarySearchResult  # noqa: E501
from openapi_server.models.house import House  # noqa: E501
from openapi_server.models.originating_house import OriginatingHouse  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.stage_summary_search_result import StageSummarySearchResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBillsController(BaseTestCase):
    """BillsController integration test stubs"""

    def test_api_v1_bills_bill_id_stages_get(self):
        """Test case for api_v1_bills_bill_id_stages_get

        Returns all Bill stages.
        """
        query_string = [('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Stages'.format(bill_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bill(self):
        """Test case for get_bill

        Return a Bill.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}'.format(bill_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bill_stage_details(self):
        """Test case for get_bill_stage_details

        Returns a Bill stage.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Stages/{bill_stage_id}'.format(bill_id=56, bill_stage_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bills(self):
        """Test case for get_bills

        Returns a list of Bills.
        """
        query_string = [('SearchTerm', 'search_term_example'),
                        ('Session', 56),
                        ('CurrentHouse', openapi_server.House()),
                        ('OriginatingHouse', openapi_server.OriginatingHouse()),
                        ('MemberId', 56),
                        ('DepartmentId', 56),
                        ('BillStage', [56]),
                        ('BillStagesExcluded', [56]),
                        ('IsDefeated', True),
                        ('IsWithdrawn', True),
                        ('BillType', [56]),
                        ('SortOrder', openapi_server.BillSortOrder()),
                        ('BillIds', [56]),
                        ('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
