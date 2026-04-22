defmodule Elixr.Router do
  use Plug.Router

  plug :match
  plug :dispatch

  get "/" do
    body = Jason.encode!(%{message: Elixr.greeting()})

    conn
    |> put_resp_content_type("application/json")
    |> send_resp(200, body)
  end

  get "/health" do
    body = Jason.encode!(%{status: "ok"})

    conn
    |> put_resp_content_type("application/json")
    |> send_resp(200, body)
  end

  match _ do
    body = Jason.encode!(%{error: "not found"})

    conn
    |> put_resp_content_type("application/json")
    |> send_resp(404, body)
  end
end