import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.idfa_declaration_create_request import IdfaDeclarationCreateRequest  # noqa: E501
from openapi_server.models.idfa_declaration_response import IdfaDeclarationResponse  # noqa: E501
from openapi_server.models.idfa_declaration_update_request import IdfaDeclarationUpdateRequest  # noqa: E501
from openapi_server import util


def idfa_declarations_create_instance(idfa_declaration_create_request):  # noqa: E501
    """idfa_declarations_create_instance

     # noqa: E501

    :param idfa_declaration_create_request: IdfaDeclaration representation
    :type idfa_declaration_create_request: dict | bytes

    :rtype: Union[IdfaDeclarationResponse, Tuple[IdfaDeclarationResponse, int], Tuple[IdfaDeclarationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        idfa_declaration_create_request = IdfaDeclarationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def idfa_declarations_delete_instance(id):  # noqa: E501
    """idfa_declarations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def idfa_declarations_update_instance(id, idfa_declaration_update_request):  # noqa: E501
    """idfa_declarations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param idfa_declaration_update_request: IdfaDeclaration representation
    :type idfa_declaration_update_request: dict | bytes

    :rtype: Union[IdfaDeclarationResponse, Tuple[IdfaDeclarationResponse, int], Tuple[IdfaDeclarationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        idfa_declaration_update_request = IdfaDeclarationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
