import unittest

from flask import json

from openapi_server.models.app_store_review_attachment_create_request import AppStoreReviewAttachmentCreateRequest  # noqa: E501
from openapi_server.models.app_store_review_attachment_response import AppStoreReviewAttachmentResponse  # noqa: E501
from openapi_server.models.app_store_review_attachment_update_request import AppStoreReviewAttachmentUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreReviewAttachmentsController(BaseTestCase):
    """AppStoreReviewAttachmentsController integration test stubs"""

    def test_app_store_review_attachments_create_instance(self):
        """Test case for app_store_review_attachments_create_instance

        
        """
        app_store_review_attachment_create_request = {"data":{"relationships":{"appStoreReviewDetail":{"data":{"id":"id","type":"appStoreReviewDetails"}}},"attributes":{"fileName":"fileName","fileSize":0},"type":"appStoreReviewAttachments"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewAttachments',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_review_attachment_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_attachments_delete_instance(self):
        """Test case for app_store_review_attachments_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewAttachments/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_attachments_get_instance(self):
        """Test case for app_store_review_attachments_get_instance

        
        """
        query_string = [('fields[appStoreReviewAttachments]', ['fields_app_store_review_attachments_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewAttachments/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_review_attachments_update_instance(self):
        """Test case for app_store_review_attachments_update_instance

        
        """
        app_store_review_attachment_update_request = {"data":{"attributes":{"uploaded":True,"sourceFileChecksum":"sourceFileChecksum"},"id":"id","type":"appStoreReviewAttachments"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreReviewAttachments/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_review_attachment_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
