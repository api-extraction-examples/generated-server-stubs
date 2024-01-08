import unittest

from flask import json

from openapi_server.models.bill_publication_list import BillPublicationList  # noqa: E501
from openapi_server.models.bill_stage_publication_list import BillStagePublicationList  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPublicationsController(BaseTestCase):
    """PublicationsController integration test stubs"""

    def test_api_v1_bills_bill_id_stages_stage_id_publications_get(self):
        """Test case for api_v1_bills_bill_id_stages_stage_id_publications_get

        Return a list of Bill stage publications.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Stages/{stage_id}/Publications'.format(bill_id=56, stage_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bill_publication(self):
        """Test case for get_bill_publication

        Return a list of Bill publications.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/Publications'.format(bill_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
