import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.publication_document import PublicationDocument  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDocumentsController(BaseTestCase):
    """DocumentsController integration test stubs"""

    def test_api_v1_publications_publication_id_documents_document_id_download_get(self):
        """Test case for api_v1_publications_publication_id_documents_document_id_download_get

        Return a document.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Publications/{publication_id}/Documents/{document_id}/Download'.format(publication_id=56, document_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_publications_publication_id_documents_document_id_get(self):
        """Test case for api_v1_publications_publication_id_documents_document_id_get

        Return information on a document.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Publications/{publication_id}/Documents/{document_id}'.format(publication_id=56, document_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
