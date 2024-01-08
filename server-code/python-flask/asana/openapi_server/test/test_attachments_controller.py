import unittest

from flask import json

from openapi_server.models.create_attachment_for_object200_response import CreateAttachmentForObject200Response  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_attachments_for_object200_response import GetAttachmentsForObject200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAttachmentsController(BaseTestCase):
    """AttachmentsController integration test stubs"""

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_attachment_for_object(self):
        """Test case for create_attachment_for_object

        Upload an attachment
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        data = dict(connect_to_app=True,
                    file='/path/to/file',
                    name='name_example',
                    parent='parent_example',
                    resource_subtype='resource_subtype_example',
                    url='url_example')
        response = self.client.open(
            '/api/1.0/attachments',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_attachment(self):
        """Test case for delete_attachment

        Delete an attachment
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/attachments/{attachment_gid}'.format(attachment_gid='12345'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachment(self):
        """Test case for get_attachment

        Get an attachment
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/attachments/{attachment_gid}'.format(attachment_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachments_for_object(self):
        """Test case for get_attachments_for_object

        Get attachments from an object
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('parent', '159874')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/attachments',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
