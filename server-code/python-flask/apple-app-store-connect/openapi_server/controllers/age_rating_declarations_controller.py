import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.age_rating_declaration_update_request import AgeRatingDeclarationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def age_rating_declarations_update_instance(id, age_rating_declaration_update_request):  # noqa: E501
    """age_rating_declarations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param age_rating_declaration_update_request: AgeRatingDeclaration representation
    :type age_rating_declaration_update_request: dict | bytes

    :rtype: Union[AgeRatingDeclarationResponse, Tuple[AgeRatingDeclarationResponse, int], Tuple[AgeRatingDeclarationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        age_rating_declaration_update_request = AgeRatingDeclarationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
