import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.publication_document import PublicationDocument  # noqa: E501
from openapi_server import util


def api_v1_publications_publication_id_documents_document_id_download_get(publication_id, document_id):  # noqa: E501
    """Return a document.

     # noqa: E501

    :param publication_id: Document with publication Id specified
    :type publication_id: int
    :param document_id: Document with Id specified
    :type document_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_publications_publication_id_documents_document_id_get(publication_id, document_id):  # noqa: E501
    """Return information on a document.

     # noqa: E501

    :param publication_id: Document with publication Id specified
    :type publication_id: int
    :param document_id: Document with Id specified
    :type document_id: int

    :rtype: Union[PublicationDocument, Tuple[PublicationDocument, int], Tuple[PublicationDocument, int, Dict[str, str]]
    """
    return 'do some magic!'
