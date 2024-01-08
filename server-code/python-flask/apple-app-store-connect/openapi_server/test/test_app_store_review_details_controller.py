import unittest

from flask import json

from openapi_server.models.app_store_review_attachments_response import AppStoreReviewAttachmentsResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_create_request import AppStoreReviewDetailCreateRequest  # noqa: E501
from openapi_server.models.app_store_review_detail_response import AppStoreReviewDetailResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_update_request import AppStoreReviewDetailUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreReviewDetailsController(BaseTestCase):
    """AppStoreReviewDetailsController integration test stubs"""

    def test_app_store_review_details_app_store_review_attachments_get_to_many_related(self):
        """Test case for app_store_review_details_app_store_review_attachments_get_to_many_related

        
        """
        query_string = [('fields[appStoreReviewDetails]', ['fields_app_store_review_details_example']),
                        ('fields[appStoreReviewAttachments]', ['fields_app_store_review_attachments_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewDetails/{id}/appStoreReviewAttachments'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_details_create_instance(self):
        """Test case for app_store_review_details_create_instance

        
        """
        app_store_review_detail_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"attributes":{"demoAccountPassword":"demoAccountPassword","notes":"notes","contactEmail":"contactEmail","contactFirstName":"contactFirstName","demoAccountRequired":True,"demoAccountName":"demoAccountName","contactLastName":"contactLastName","contactPhone":"contactPhone"},"type":"appStoreReviewDetails"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewDetails',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_review_detail_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_details_get_instance(self):
        """Test case for app_store_review_details_get_instance

        
        """
        query_string = [('fields[appStoreReviewDetails]', ['fields_app_store_review_details_example']),
                        ('include', ['include_example']),
                        ('fields[appStoreReviewAttachments]', ['fields_app_store_review_attachments_example']),
                        ('limit[appStoreReviewAttachments]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewDetails/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_details_update_instance(self):
        """Test case for app_store_review_details_update_instance

        
        """
        app_store_review_detail_update_request = {"data":{"attributes":{"demoAccountPassword":"demoAccountPassword","notes":"notes","contactEmail":"contactEmail","contactFirstName":"contactFirstName","demoAccountRequired":True,"demoAccountName":"demoAccountName","contactLastName":"contactLastName","contactPhone":"contactPhone"},"id":"id","type":"appStoreReviewDetails"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewDetails/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_review_detail_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
